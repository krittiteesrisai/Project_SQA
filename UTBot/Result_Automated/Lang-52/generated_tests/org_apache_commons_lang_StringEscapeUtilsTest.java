package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FilterOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import sun.nio.cs.StreamEncoder;
import java.io.Writer;
import java.nio.ReadOnlyBufferException;
import java.io.BufferedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_lang_StringEscapeUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.hex
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hex(char)
    
    @Test
    public void testHex1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class charType = char.class;
        Method hexMethod = stringEscapeUtilsClazz.getDeclaredMethod("hex", charType);
        hexMethod.setAccessible(true);
        java.lang.Object[] hexMethodArguments = new java.lang.Object[1];
        hexMethodArguments[0] = '\u0010';
        String actual = ((String) hexMethod.invoke(null, hexMethodArguments));
        
        String expected = "10";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeXml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeXml(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEscapeXml_StrEqualsNull() {
        String actual = StringEscapeUtils.escapeXml(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeXml(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.lang.String)}
     */
    @Test
    public void testEscapeXmlWithNonEmptyString() {
        String actual = StringEscapeUtils.escapeXml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.lang.String)}
     */
    @Test
    public void testEscapeXmlWithEmptyString() {
        String actual = StringEscapeUtils.escapeXml("");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeXml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeXml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): False}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEscapeXml_StrEqualsNull1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.escapeXml(fileWriter, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method escapeXml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: writer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXml_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.escapeXml(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeXml(java.io.Writer, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeXml(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testEscapeXmlWithNonEmptyString1() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.escapeXml(outputStreamWriter, "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJavaStyleString(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\n";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\n";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\b";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\b";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\f";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\f";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\"";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = ((Object) null);
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull_5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJavaStyleString(java.lang.String, boolean)
    
    @Test
    public void testEscapeJavaStyleString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\r\u0080";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\r\\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\u0000";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = true;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\'\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\t";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\r\u0100";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\r\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \u1000";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = " \\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\u0010";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\u0010";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u1000";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0100";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\u0100";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrEqualsNull1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = ((Object) null);
        escapeJavaStyleStringMethodArguments[2] = false;
        escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testEscapeJavaStyleString_NotEscapeSingleQuote() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "'";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaStyleString_ThrowIllegalArgumentException() throws Throwable  {
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class writerType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", writerType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = ((Object) null);
        escapeJavaStyleStringMethodArguments[1] = ((Object) null);
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write(ch);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_1() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "'";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = true;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_2() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\f";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_3() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\"";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_4() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\b";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\'');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_5() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "'";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_6() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\n";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_7() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class fileWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", fileWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = fileWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaStyleString_ThrowNullPointerException() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:237) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaStyleString_ThrowNullPointerException_1() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:226) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaStyleString_ThrowNullPointerException_2() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:205) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
     */
    @Test
    public void testEscapeJavaStyleStringWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class outputStreamWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", outputStreamWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = outputStreamWriter;
        escapeJavaStyleStringMethodArguments[1] = "abc";
        escapeJavaStyleStringMethodArguments[2] = true;
        escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method escapeJavaStyleString(java.io.Writer, java.lang.String, boolean)
    
    @Test
    public void testEscapeJavaStyleString9() throws Throwable  {
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        String string = "\u000B\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:216) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class anonymousPrintWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", anonymousPrintWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = anonymousPrintWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString10() throws Throwable  {
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        String string = "\u0010";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:214) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class anonymousPrintWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", anonymousPrintWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = anonymousPrintWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString11() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:197) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString12() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:233) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString13() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:201) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString14() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:224) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = true;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString15() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:193) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString16() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:209) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEscapeJavaStyleString17() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:229) */
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class printWriterType = Class.forName("java.io.Writer");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", printWriterType, stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[3];
        escapeJavaStyleStringMethodArguments[0] = printWriter;
        escapeJavaStyleStringMethodArguments[1] = string;
        escapeJavaStyleStringMethodArguments[2] = false;
        try {
            escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for escapeJavaStyleString
    
    public void testEscapeJavaStyleString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJava
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJava() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJava_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.escapeJava(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJava_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "'";
        
        StringEscapeUtils.escapeJava(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method escapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.invokes org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJava_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.escapeJava(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method escapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_2() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\"";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_3() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\r";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_4() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\b";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:237)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:226)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:193)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJava(java.io.Writer, java.lang.String)
    
    @Test
    public void testEscapeJava1() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u000B";
        
        StringEscapeUtils.escapeJava(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJava2() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u1000";
        
        StringEscapeUtils.escapeJava(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJava3() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u0100";
        
        StringEscapeUtils.escapeJava(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJava4() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " \u0080";
        
        StringEscapeUtils.escapeJava(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    @Test
    public void testEscapeJava5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " \u0010";
        
        StringEscapeUtils.escapeJava(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    @Test
    public void testEscapeJava6() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " \u1000";
        
        StringEscapeUtils.escapeJava(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method escapeJava(java.io.Writer, java.lang.String)
    
    @Test
    public void testEscapeJava7() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\r\u0000";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:209)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    @Test
    public void testEscapeJava8() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:205)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    @Test
    public void testEscapeJava9() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:229)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    @Test
    public void testEscapeJava10() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:233)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    @Test
    public void testEscapeJava11() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:201)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    @Test
    public void testEscapeJava12() throws Exception  {
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:197)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:97) */
        StringEscapeUtils.escapeJava(anonymousPrintWriter, string);
    }
    ///endregion
    
    ///region Errors report for escapeJava
    
    public void testEscapeJava_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJava
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJava(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, false);}
 *  */
    @Test
    public void testEscapeJava_ReturnEscapeJavaStyleString() {
        String string = "\n";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\n";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, false);}
 *  */
    @Test
    public void testEscapeJava_ReturnEscapeJavaStyleString_1() {
        String string = "";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, false);}
 *  */
    @Test
    public void testEscapeJava_ReturnEscapeJavaStyleString_2() {
        String actual = StringEscapeUtils.escapeJava(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJava(java.lang.String)
    
    @Test
    public void testEscapeJava13() {
        String string = "\r\u000E";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\r\\u000E";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava14() {
        String string = "\"";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava15() {
        String string = "'\b";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\b";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava16() {
        String string = "'\f";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\f";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava17() {
        String string = "'\t";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava18() {
        String string = " \u0100";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = " \\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava19() {
        String string = "\\\u0010";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\\\\\u0010";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava20() {
        String string = "\r\u0080";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\r\\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava21() {
        String string = "'\u1000";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava22() {
        String string = "\u2000";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\u2000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJavaScript
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJavaScript() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJavaScript_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.escapeJavaScript(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJavaScript_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = " ";
        
        StringEscapeUtils.escapeJavaScript(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.invokes org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaScript_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.escapeJavaScript(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\r";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_2() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\n";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_3() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_4() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\"";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_5() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "'";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_6() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\f";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaScript_ThrowIOException_7() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\t";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:237)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:209)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:224)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    @Test
    public void testEscapeJavaScript1() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u1000";
        
        StringEscapeUtils.escapeJavaScript(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript2() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u0080";
        
        StringEscapeUtils.escapeJavaScript(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript3() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u000E";
        
        StringEscapeUtils.escapeJavaScript(anonymousWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript4() throws Exception  {
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        String string = "\u0010";
        
        StringEscapeUtils.escapeJavaScript(anonymousWriter, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method escapeJavaScript(java.io.Writer, java.lang.String)
    
    @Test
    public void testEscapeJavaScript5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:201)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript6() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:233)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript7() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:229)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript8() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:205)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript9() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:193)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testEscapeJavaScript10() throws Exception  {
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:197)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:138) */
        StringEscapeUtils.escapeJavaScript(anonymousPrintWriter, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJavaScript
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJavaScript(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, true);}
 *  */
    @Test
    public void testEscapeJavaScript_ReturnEscapeJavaStyleString() {
        String string = "\t";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\t";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, true);}
 *  */
    @Test
    public void testEscapeJavaScript_ReturnEscapeJavaStyleString_1() {
        String string = "";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, true);}
 *  */
    @Test
    public void testEscapeJavaScript_ReturnEscapeJavaStyleString_2() {
        String actual = StringEscapeUtils.escapeJavaScript(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJavaScript(java.lang.String)
    
    @Test
    public void testEscapeJavaScript11() {
        String string = "\"";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript12() {
        String string = "\f";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\f";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript13() {
        String string = " \n";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = " \\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript14() {
        String string = " \b";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = " \\b";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript15() {
        String string = "\\\u0010";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\\\\u0010";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript16() {
        String string = "\\\r";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\\\\r";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript17() {
        String string = "\\\u0080";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\\\\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript18() {
        String string = "\\\u0100";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\\\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript19() {
        String string = "'\u0000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\'\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript20() {
        String string = " \u1000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = " \\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript21() {
        String string = "\u0100";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript22() {
        String string = "\u8000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\u8000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeJava
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeJava_StrEqualsNull() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.unescapeJava(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (hadSlash): False}
 *  */
    @Test
    public void testUnescapeJava_NotHadSlash() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 *  */
    @Test
    public void testUnescapeJava_ChEqualsChar() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "\\u";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testUnescapeJava_ChNotEqualsChar() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = " ";
        
        StringEscapeUtils.unescapeJava(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: out == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJava_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.unescapeJava(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (hadSlash): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.write('\\');
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescapeJava_ThrowReadOnlyBufferException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\\";
        
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (hadSlash): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.write('\\');
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescapeJava_ThrowReadOnlyBufferException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\\";
        
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (hadSlash): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.write('\\');
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUnescapeJava_ThrowIllegalStateException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\\";
        
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write(ch);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\'');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\'";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write(ch);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_2() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\ ";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\n');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_3() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\n";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('"');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_4() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\\"";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\f');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_5() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\f";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\r');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_6() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\r";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\t');
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJava_ThrowIOException_7() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\t";
        
        StringEscapeUtils.unescapeJava(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescapeJava(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): True}
 * @utbot.invokes {@link java.io.Writer#write(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:374) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:369) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:331) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:352) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_4() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\ ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:361) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:340) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_6() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:337) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_7() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:334) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_8() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:349) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_9() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:346) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (hadSlash): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_10() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:343) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write('\n');
 *  */
    @Test
    public void testUnescapeJava_ThrowNullPointerException_11() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        Writer out1 = ((Writer) createInstance("java.io.Writer$1"));
        setField(out, "java.io.BufferedWriter", "out", out1);
        char[] cb = {'\u0000', '\u0000'};
        setField(out, "java.io.BufferedWriter", "cb", cb);
        setField(out, "java.io.BufferedWriter", "nChars", 1073741824);
        setField(out, "java.io.BufferedWriter", "nextChar", 1073741823);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "\\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:349) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testUnescapeJavaWithNonEmptyString() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.unescapeJava(outputStreamWriter, "Z");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeJava
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeJava(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull() {
        String string = " ";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_1() {
        String string = "\\";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_2() {
        String string = "\\'";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "'";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_3() {
        String string = "\\\"";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_4() {
        String string = "\\r";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\r";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_5() {
        String string = "\\b";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\b";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_6() {
        String string = "\\\\";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_7() {
        String string = "\\t";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\t";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_8() {
        String string = "\\ ";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_9() {
        String string = "\\f";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\f";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_10() {
        String string = "\\n";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\n";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_11() {
        String string = "\\u ";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_12() {
        String string = "";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testUnescapeJava_StrEqualsNull1() {
        String actual = StringEscapeUtils.unescapeJava(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeHtml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeHtml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): False}
 * @utbot.executesCondition {@code (string == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEscapeHtml_StringEqualsNull() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.escapeHtml(fileWriter, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method escapeHtml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: writer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtml_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.escapeHtml(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeHtml(java.io.Writer, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testEscapeHtmlWithNonEmptyString() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.escapeHtml(outputStreamWriter, "abc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testEscapeHtmlWithNonEmptyString1() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.escapeHtml(outputStreamWriter, "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeHtml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeHtml(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testEscapeHtml_StrEqualsNull() {
        String actual = StringEscapeUtils.escapeHtml(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeHtml(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.lang.String)}
     */
    @Test
    public void testEscapeHtmlWithNonEmptyString2() {
        String actual = StringEscapeUtils.escapeHtml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeHtml(java.lang.String)}
     */
    @Test
    public void testEscapeHtmlWithEmptyString() {
        String actual = StringEscapeUtils.escapeHtml("");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeSql
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeSql(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeSql(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return StringUtils.replace(str, "'", "''");}
 *  */
    @Test
    public void testEscapeSql_StrNotEqualsNull() {
        String string = " ";
        
        String actual = StringEscapeUtils.escapeSql(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeSql(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEscapeSql_StrEqualsNull() {
        String actual = StringEscapeUtils.escapeSql(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeSql(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return StringUtils.replace(str, "'", "''");}
 *  */
    @Test
    public void testEscapeSql_StrNotEqualsNull_1() {
        String string = "";
        
        String actual = StringEscapeUtils.escapeSql(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeJavaScript(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava() {
        String string = "\\";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_1() {
        String string = " ";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_2() {
        String string = "\\b";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\b";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_3() {
        String string = "\\\"";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\"";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_4() {
        String string = "\\ ";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_5() {
        String string = "\\n";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\n";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_6() {
        String string = "\\\\";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_7() {
        String string = "\\t";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\t";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_8() {
        String string = "\\r";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\r";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_9() {
        String string = "\\'";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "'";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_10() {
        String string = "\\f";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\f";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_11() {
        String string = "\\u ";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_12() {
        String string = "";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_13() {
        String actual = StringEscapeUtils.unescapeJavaScript(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript_4() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "\\u";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = " ";
        
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript_3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\\n";
        
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaScript_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.unescapeJavaScript(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method unescapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_2() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\\"";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_3() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\t";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_4() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\\\";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_5() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\n";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_6() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\r";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_7() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\ ";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: unescapeJava(out, str);
 *  */
    @Test(expected = IOException.class)
    public void testUnescapeJavaScript_ThrowIOException_8() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\\b";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescapeJavaScript(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:374)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:369)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:340)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:334)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_4() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:346)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:352)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_6() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\\\";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:331)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_7() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\ ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:361)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_8() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:343)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnescapeJavaScript_ThrowNullPointerException_9() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\\\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:337)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:410) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeHtml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeHtml(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeHtml(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testUnescapeHtml_StrEqualsNull() {
        String actual = StringEscapeUtils.unescapeHtml(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeHtml(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeHtml(java.lang.String)}
     */
    @Test
    public void testUnescapeHtmlWithNonEmptyString() {
        String actual = StringEscapeUtils.unescapeHtml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeHtml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeHtml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeHtml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): False}
 * @utbot.executesCondition {@code (string == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeHtml_StringEqualsNull() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.unescapeHtml(fileWriter, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeHtml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeHtml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: writer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtml_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.unescapeHtml(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeHtml(java.io.Writer, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeHtml(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testUnescapeHtmlWithNonEmptyString1() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.unescapeHtml(outputStreamWriter, "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeXml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeXml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeXml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): False}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeXml_StrEqualsNull() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        StringEscapeUtils.unescapeXml(fileWriter, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeXml(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeXml(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (writer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: writer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXml_ThrowIllegalArgumentException() throws IOException  {
        StringEscapeUtils.unescapeXml(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeXml(java.io.Writer, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeXml(java.io.Writer,java.lang.String)}
     */
    @Test
    public void testUnescapeXmlWithNonEmptyString() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(filterOutputStream);
        
        StringEscapeUtils.unescapeXml(outputStreamWriter, "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeXml
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeXml(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeXml(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testUnescapeXml_StrEqualsNull1() {
        String actual = StringEscapeUtils.unescapeXml(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescapeXml(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeXml(java.lang.String)}
     */
    @Test
    public void testUnescapeXmlWithNonEmptyString1() {
        String actual = StringEscapeUtils.unescapeXml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields660059159843500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields660059159843500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass660059159849100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields660059159843500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass660059159849100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields660059160179900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields660059160179900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass660059160180700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields660059160179900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass660059160180700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


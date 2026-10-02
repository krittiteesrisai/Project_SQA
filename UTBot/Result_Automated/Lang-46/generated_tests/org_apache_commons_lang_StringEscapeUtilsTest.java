package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CoderMalfunctionError;
import org.apache.commons.lang.exception.NestableRuntimeException;
import java.io.Writer;
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
    public void testEscapeJavaStyleString_StrEqualsNull() throws Exception  {
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
    public void testEscapeJavaStyleString_StrNotEqualsNull() throws Exception  {
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
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\\');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException() throws Throwable  {
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
 * @utbot.throwsException {@link java.io.IOException} in: out.write(ch);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_1() throws Throwable  {
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
    public void testEscapeJavaStyleString_ThrowIOException_2() throws Throwable  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "/";
        
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
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\'');
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJavaStyleString_ThrowIOException_4() throws Throwable  {
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
    public void testEscapeJavaStyleString_ThrowIOException_5() throws Throwable  {
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
    public void testEscapeJavaStyleString_ThrowIOException_6() throws Throwable  {
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
        String string = "'";
        
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
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaStyleString_ThrowNullPointerException_1() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:248) */
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
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:204) */
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
    public void testEscapeJavaStyleString_ThrowNullPointerException_3() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:216) */
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
    public void testEscapeJavaStyleString_ThrowNullPointerException_4() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:208) */
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
    public void testEscapeJavaStyleString_ThrowNullPointerException_5() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:212) */
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escapeJavaStyleString(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrEqualsNull1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes org.apache.commons.lang.StringEscapeUtils#escapeJavaStyleString(java.io.Writer,java.lang.String,boolean)
 * @utbot.invokes {@link java.io.StringWriter#toString()}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testEscapeJavaStyleString_StrNotEqualsNull1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    @Test
    public void testEscapeJavaStyleString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\b";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\b";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \t";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = " \\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \r";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = " \\r";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \f";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = " \\f";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\\";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\\\";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'/";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\/";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\n\u0000";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\n\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = true;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "\\'";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString10() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\u001E";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\u001E";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \u0080";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = " \\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString12() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "'\u0100";
        
        Class stringEscapeUtilsClazz = Class.forName("org.apache.commons.lang.StringEscapeUtils");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method escapeJavaStyleStringMethod = stringEscapeUtilsClazz.getDeclaredMethod("escapeJavaStyleString", stringType, booleanType);
        escapeJavaStyleStringMethod.setAccessible(true);
        java.lang.Object[] escapeJavaStyleStringMethodArguments = new java.lang.Object[2];
        escapeJavaStyleStringMethodArguments[0] = string;
        escapeJavaStyleStringMethodArguments[1] = false;
        String actual = ((String) escapeJavaStyleStringMethod.invoke(null, escapeJavaStyleStringMethodArguments));
        
        String expected = "'\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaStyleString13() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    public void testEscapeJavaStyleString14() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    @Test
    public void testEscapeJavaStyleString15() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
        String string = " ";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, false);}
 *  */
    @Test
    public void testEscapeJava_ReturnEscapeJavaStyleString_1() {
        String actual = StringEscapeUtils.escapeJava(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.lang.String)}
 * @utbot.returnsFrom {@code return escapeJavaStyleString(str, false);}
 *  */
    @Test
    public void testEscapeJava_ReturnEscapeJavaStyleString_2() {
        String string = "";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJava(java.lang.String)
    
    @Test
    public void testEscapeJava1() {
        String string = "\f";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\f";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava2() {
        String string = "\r";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\r";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava3() {
        String string = "'\b";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\b";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava4() {
        String string = "/";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\/";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava5() {
        String string = "\n\u0100";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\n\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava6() {
        String string = "\\";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\\\";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava7() {
        String string = "\u0080";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava8() {
        String string = "\"\u0000";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\\"\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava9() {
        String string = "\u0010";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\u0010";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava10() {
        String string = "'\t";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava11() {
        String string = "'\u1000";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "'\\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava12() {
        String string = "\u1000";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJava13() {
        String string = "\u0100";
        
        String actual = StringEscapeUtils.escapeJava(string);
        
        String expected = "\\u0100";
        
        assertEquals(expected, actual);
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
        
        StringEscapeUtils.escapeJava(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJava_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
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
        String string = "\t";
        
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
        String string = "\f";
        
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
        String string = "\\";
        
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
        String string = "/";
        
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
        String string = "\r";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_5() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = "\n";
        
        StringEscapeUtils.escapeJava(fileWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.io.IOException} in: escapeJavaStyleString(out, str, false);
 *  */
    @Test(expected = IOException.class)
    public void testEscapeJava_ThrowIOException_6() throws Exception  {
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
    public void testEscapeJava_ThrowIOException_7() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
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
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:233)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
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
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:248)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
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
        String string = "/";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:244)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException_3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:208)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException_4() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:200)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
        StringEscapeUtils.escapeJava(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJava(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJava_ThrowNullPointerException_5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:212)
            org.apache.commons.lang.StringEscapeUtils.escapeJava(StringEscapeUtils.java:102) */
        StringEscapeUtils.escapeJava(printWriter, string);
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
        
        StringEscapeUtils.escapeJavaScript(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testEscapeJavaScript_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.escapeJavaScript(fileWriter, string);
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
        String string = "\f";
        
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
        String string = "\r";
        
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
        String string = "\n";
        
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
        String string = "\t";
        
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
        String string = "\b";
        
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
        String string = " ";
        
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
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:248)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
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
        String string = "/";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:244)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_4() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:200)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_5() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:216)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_6() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "\t";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:208)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out, "java.io.BufferedWriter", "out", out1);
        char[] cb = {'\u0000'};
        setField(out, "java.io.BufferedWriter", "cb", cb);
        setField(out, "java.io.BufferedWriter", "nextChar", -1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:231)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeJavaScript(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: escapeJavaStyleString(out, str, true);
 *  */
    @Test
    public void testEscapeJavaScript_ThrowNullPointerException_3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out, "java.io.BufferedWriter", "out", out1);
        char[] cb = {};
        setField(out, "java.io.BufferedWriter", "cb", cb);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "'";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.escapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(StringEscapeUtils.java:231)
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(StringEscapeUtils.java:143) */
        StringEscapeUtils.escapeJavaScript(printWriter, string);
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
        String actual = StringEscapeUtils.escapeJavaScript(null);
        
        assertNull(actual);
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeJavaScript(java.lang.String)
    
    @Test
    public void testEscapeJavaScript1() {
        String string = "\r\u1000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\r\\u1000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript2() {
        String string = "\"\u001E";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\"\\u001E";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript3() {
        String string = "\t";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript4() {
        String string = " \u0080";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = " \\u0080";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript5() {
        String string = "\f\u0000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\f\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript6() {
        String string = "\\\u0000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\\\\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript7() {
        String string = "\n";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript8() {
        String string = "\b\u0000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\b\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript9() {
        String string = "/\u0100";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\/\\u0100";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript10() {
        String string = "'\u0000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\'\\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript11() {
        String string = "\u2000";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\u2000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscapeJavaScript12() {
        String string = "\u0800";
        
        String actual = StringEscapeUtils.escapeJavaScript(string);
        
        String expected = "\\u0800";
        
        assertEquals(expected, actual);
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
    public void testUnescapeXml_StrEqualsNull() {
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
    public void testUnescapeXmlWithNonEmptyString() {
        String actual = StringEscapeUtils.unescapeXml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
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
    public void testUnescapeXml_StrEqualsNull1() throws Exception  {
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeSql(java.lang.String)
    
    @Test
    public void testEscapeSql1() {
        String string = "\u0000\u0000\u0000'\u0000'\u0000";
        
        String actual = StringEscapeUtils.escapeSql(string);
        
        String expected = "\u0000\u0000\u0000''\u0000''\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeCsv
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeCsv(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeCsv_StrEqualsNull() throws IOException  {
        StringEscapeUtils.unescapeCsv(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeCsv_StrNotEqualsNull() throws Exception  {
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(stringWriter, "java.io.StringWriter", "buf", buf);
        String string = " ";
        
        StringEscapeUtils.unescapeCsv(stringWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeCsv_WriterWrite() throws Exception  {
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(stringWriter, "java.io.StringWriter", "buf", buf);
        String string = "  ";
        
        StringEscapeUtils.unescapeCsv(stringWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUnescapeCsv_StrNotEqualsNull_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "";
        
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescapeCsv(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(str);
 *  */
    @Test
    public void testUnescapeCsv_ThrowNullPointerException() throws IOException  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:843) */
        StringEscapeUtils.unescapeCsv(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(str);
 *  */
    @Test
    public void testUnescapeCsv_ThrowNullPointerException_1() throws IOException  {
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:847) */
        StringEscapeUtils.unescapeCsv(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(str);
 *  */
    @Test
    public void testUnescapeCsv_ThrowNullPointerException_3() throws IOException  {
        String string = "\" ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:847) */
        StringEscapeUtils.unescapeCsv(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return;
 *  */
    @Test
    public void testUnescapeCsv_ThrowNullPointerException_2() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:847) */
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeCsv(java.io.Writer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescapeCsv_ThrowReadOnlyBufferException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " ";
        
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testUnescapeCsv_ThrowReadOnlyBufferException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " ";
        
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testUnescapeCsv_ThrowCoderMalfunctionError() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " ";
        
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.io.Writer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUnescapeCsv_ThrowIllegalStateException() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = " ";
        
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeCsv(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescapeCsv1() throws Exception  {
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(stringWriter, "java.io.StringWriter", "buf", buf);
        String string = "\"\u0000";
        
        StringEscapeUtils.unescapeCsv(stringWriter, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescapeCsv(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescapeCsv2() throws Exception  {
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        String string = "\"\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:106)
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:859) */
        StringEscapeUtils.unescapeCsv(stringWriter, string);
    }
    
    @Test
    public void testUnescapeCsv3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out2 = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(out1, "java.io.PrintWriter", "out", out2);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeCsv] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:541)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(StringEscapeUtils.java:843) */
        StringEscapeUtils.unescapeCsv(printWriter, string);
    }
    ///endregion
    
    ///region Errors report for unescapeCsv
    
    public void testUnescapeCsv_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.unescapeCsv
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeCsv(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeCsv_StrNotEqualsNull1() {
        String string = "  ";
        
        String actual = StringEscapeUtils.unescapeCsv(string);
        
        String expected = "  ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testUnescapeCsv_StrEqualsNull1() {
        String actual = StringEscapeUtils.unescapeCsv(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeCsv(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeCsv_StrNotEqualsNull_11() {
        String string = "";
        
        String actual = StringEscapeUtils.unescapeCsv(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeCsv(java.lang.String)
    
    @Test
    public void testUnescapeCsv4() {
        String string = "\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"";
        
        String actual = StringEscapeUtils.unescapeCsv(string);
        
        String expected = "\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeCsv5() {
        String string = "\"\"";
        
        String actual = StringEscapeUtils.unescapeCsv(string);
        
        String expected = "\"\"";
        
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:385) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:380) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:342) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:363) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:372) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:351) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:348) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:345) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:360) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:357) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:354) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescapeJava1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "\\f";
        
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeJava(java.io.Writer, java.lang.String)
    
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava2() throws Exception  {
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        String string = "\\u\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        StringEscapeUtils.unescapeJava(anonymousPrintWriter, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescapeJava(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescapeJava3() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        Writer out1 = ((Writer) createInstance("java.io.Writer$1"));
        setField(out, "java.io.BufferedWriter", "out", out1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "\\n";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJava] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:360) */
        StringEscapeUtils.unescapeJava(printWriter, string);
    }
    ///endregion
    
    ///region Errors report for unescapeJava
    
    public void testUnescapeJava_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        String string = "\\";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\\";
        
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
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJava(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testUnescapeJava_StrNotEqualsNull_1() {
        String string = "";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeJava(java.lang.String)
    
    @Test
    public void testUnescapeJava4() {
        String string = "\\\\\\\u0000\u0000\u0000\u0000";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\\\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJava5() {
        String string = "\\b\\'";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\b'";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJava6() {
        String string = "\\n\\r";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\n\r";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJava7() {
        String string = "\\f\\t";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\f\t";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJava8() {
        String string = "\\\"\\u\u0000";
        
        String actual = StringEscapeUtils.unescapeJava(string);
        
        String expected = "\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeJava(java.lang.String)
    
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava9() {
        String string = "\\u\u0000\u0000\u0000\u0000\u0000";
        
        StringEscapeUtils.unescapeJava(string);
    }
    
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava10() {
        String string = "\u0000\\u\u0000\u0000\u0000\u0000";
        
        StringEscapeUtils.unescapeJava(string);
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
    public void testEscapeHtmlWithNonEmptyString() {
        String actual = StringEscapeUtils.escapeHtml("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeCsv
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeCsv(java.io.Writer, java.lang.String)
    
    @Test
    public void testEscapeCsv1() throws IOException  {
        StringEscapeUtils.escapeCsv(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.StringEscapeUtils.escapeCsv
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escapeCsv(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.StringEscapeUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#escapeCsv(java.lang.String)}
     */
    @Test
    public void testEscapeCsvWithNonEmptyString() {
        String actual = StringEscapeUtils.escapeCsv("\u0014\n\t\r");
        
        String expected = "\"\u0014\n\t\r\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escapeCsv(java.lang.String)
    
    @Test
    public void testEscapeCsv2() {
        String actual = StringEscapeUtils.escapeCsv(null);
        
        assertNull(actual);
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
    public void testUnescapeJavaScript_ReturnUnescapeJava_1() {
        String actual = StringEscapeUtils.unescapeJavaScript(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.lang.String)}
 * @utbot.returnsFrom {@code return unescapeJava(str);}
 *  */
    @Test
    public void testUnescapeJavaScript_ReturnUnescapeJava_2() {
        String string = "";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeJavaScript(java.lang.String)
    
    @Test
    public void testUnescapeJavaScript1() {
        String string = "\\\\\\\u0000\u0000\u0000\u0000";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\\\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJavaScript2() {
        String string = "\\\"\\'";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\"'";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJavaScript3() {
        String string = "\\n\\b";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\n\b";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJavaScript4() {
        String string = "\\r\\";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\r\\";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnescapeJavaScript5() {
        String string = "\\t\\f";
        
        String actual = StringEscapeUtils.unescapeJavaScript(string);
        
        String expected = "\t\f";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeJavaScript(java.lang.String)
    
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJavaScript6() {
        String string = "\u0000\\u\u0000\u0000\u0000\u0000";
        
        StringEscapeUtils.unescapeJavaScript(string);
    }
    
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJavaScript7() {
        String string = "\\\u0000\\u\u0000\u0000\u0000\u0000";
        
        StringEscapeUtils.unescapeJavaScript(string);
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
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringEscapeUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.StringEscapeUtils#unescapeJavaScript(java.io.Writer,java.lang.String)}
 *  */
    @Test
    public void testUnescapeJavaScript_1() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        String string = "";
        
        StringEscapeUtils.unescapeJavaScript(fileWriter, string);
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:385)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:380)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:351)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:345)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:357)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:363)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:342)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:372)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
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
        String string = "\\\"";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:348)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescapeJavaScript(java.io.Writer, java.lang.String)
    
    @Test
    public void testUnescapeJavaScript8() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        String string = "\\f";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:354)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    
    @Test
    public void testUnescapeJavaScript9() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        String string = "\\b";
        
        /* This test fails because method [org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(StringEscapeUtils.java:363)
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(StringEscapeUtils.java:421) */
        StringEscapeUtils.unescapeJavaScript(printWriter, string);
    }
    ///endregion
    
    ///region Errors report for unescapeJavaScript
    
    public void testUnescapeJavaScript_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields669929658508300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields669929658508300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass669929658516000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669929658508300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669929658516000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields669929658857000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields669929658857000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass669929658858900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669929658857000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669929658858900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


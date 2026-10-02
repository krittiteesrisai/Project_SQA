package org.apache.commons.cli;

import org.junit.Test;
import java.util.Date;
import java.io.File;
import java.net.URL;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_cli_TypeHandlerTest {
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createDate(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.io.PrintStream#println(java.lang.String)}
 * @utbot.returnsFrom {@code return date;}
 *  */
    @Test
    public void testCreateDate_PrintStreamPrintln() {
        Date actual = TypeHandler.createDate(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method createNumber(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return org.apache.commons.lang.math.NumberUtils.createNumber(str);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return org.apache.commons.lang.math.NumberUtils.createNumber(str);}
 *  */
    @Test
    public void testCreateNumber_ReturnOrgApacheCommonsLangMathNumberUtilsCreateNumber() {
        String string = "--";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return org.apache.commons.lang.math.NumberUtils.createNumber(str);}
 *  */
    @Test
    public void testCreateNumber_ReturnOrgApacheCommonsLangMathNumberUtilsCreateNumber_1() {
        Number actual = TypeHandler.createNumber(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method createNumber(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.NumberFormatException#getMessage()} once,
    ///     {@link java.io.PrintStream#println(java.lang.String)} once
    /// return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testCreateNumber_CatchNumberFormatException() {
        String string = "e.";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateNumber_ReturnNull() {
        String string = "D";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 *  */
    @Test
    public void testCreateNumber() {
        String string = "0x-";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateNumber_ReturnNull_1() {
        String string = "F";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testCreateNumber_CatchNumberFormatException_1() {
        String string = "\n";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return org.apache.commons.lang.math.NumberUtils.createNumber(str);
 *  */
    @Test
    public void testCreateNumber_ThrowStringIndexOutOfBoundsException() {
        String string = "L";
        
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createNumber] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            org.apache.commons.lang.math.NumberUtils.createNumber(NumberUtils.java:453)
            org.apache.commons.cli.TypeHandler.createNumber(TypeHandler.java:161) */
        TypeHandler.createNumber(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    @Test
    public void testCreateNumber1() {
        String string = "0";
        
        Integer actual = ((Integer) TypeHandler.createNumber(string));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCreateNumber2() {
        String string = "-0x";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testCreateNumber3() {
        String string = "e\u0000";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testCreateNumber4() {
        String string = ".e";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testCreateNumber5() {
        String string = "0.";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testCreateNumber6() {
        String string = "\n\u0000";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testCreateNumber7() {
        String string = "";
        
        Number actual = TypeHandler.createNumber(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createClass(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#forName(java.lang.String)}
 * @utbot.returnsFrom {@code return Class.forName(str);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Class.forName(str);
 *  */
    @Test
    public void testCreateClass_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createClass] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:375)
            org.apache.commons.cli.TypeHandler.createClass(TypeHandler.java:181) */
        TypeHandler.createClass(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createClass(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.TypeHandler}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createClass(java.lang.String)}
     */
    @Test
    public void testCreateClassWithNonEmptyString() {
        Class actual = TypeHandler.createClass("XZb");
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createValue(java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (PatternOptionBuilder.STRING_VALUE == clazz): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCreateValue_PatternOptionBuilderSTRING_VALUEEqualsClazz() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        try {
            Class stringValue = Object.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            
            Object actual = TypeHandler.createValue(((String) null), stringValue);
            
            assertNull(actual);
            
            Class finalStringValue = stringValue;
            
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (PatternOptionBuilder.STRING_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.OBJECT_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.NUMBER_VALUE == clazz): True}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return createNumber(str);}
 *  */
    @Test
    public void testCreateValue_PatternOptionBuilderNUMBER_VALUEEqualsClazz() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        Class prevNUMBER_VALUE = PatternOptionBuilder.NUMBER_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            setStaticField(patternOptionBuilderClazz, "NUMBER_VALUE", objectValue);
            String string = "";
            
            Object actual = TypeHandler.createValue(string, objectValue);
            
            assertNull(actual);
            
            Class finalObjectValue = objectValue;
            
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
            setStaticField(PatternOptionBuilder.class, "NUMBER_VALUE", prevNUMBER_VALUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (PatternOptionBuilder.STRING_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.OBJECT_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.NUMBER_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.DATE_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.CLASS_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.FILE_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.EXISTING_FILE_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.FILES_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.URL_VALUE == clazz): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateValue_PatternOptionBuilderURL_VALUENotEqualsClazz() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        Class prevNUMBER_VALUE = PatternOptionBuilder.NUMBER_VALUE;
        Class prevDATE_VALUE = PatternOptionBuilder.DATE_VALUE;
        Class prevCLASS_VALUE = PatternOptionBuilder.CLASS_VALUE;
        Class prevEXISTING_FILE_VALUE = PatternOptionBuilder.EXISTING_FILE_VALUE;
        Class prevFILE_VALUE = PatternOptionBuilder.FILE_VALUE;
        Class prevFILES_VALUE = PatternOptionBuilder.FILES_VALUE;
        Class prevURL_VALUE = PatternOptionBuilder.URL_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            Class numberValue = Number.class;
            setStaticField(patternOptionBuilderClazz, "NUMBER_VALUE", numberValue);
            Class dateValue = Date.class;
            setStaticField(patternOptionBuilderClazz, "DATE_VALUE", dateValue);
            Class classValue = Class.class;
            setStaticField(patternOptionBuilderClazz, "CLASS_VALUE", classValue);
            Class existingFileValue = java.io.FileInputStream.class;
            setStaticField(patternOptionBuilderClazz, "EXISTING_FILE_VALUE", existingFileValue);
            Class fileValue = java.io.File[].class;
            setStaticField(patternOptionBuilderClazz, "FILE_VALUE", fileValue);
            setStaticField(patternOptionBuilderClazz, "FILES_VALUE", fileValue);
            Class urlValue = URL.class;
            setStaticField(patternOptionBuilderClazz, "URL_VALUE", urlValue);
            
            Object actual = TypeHandler.createValue(((String) null), ((Class) null));
            
            assertNull(actual);
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
            setStaticField(PatternOptionBuilder.class, "NUMBER_VALUE", prevNUMBER_VALUE);
            setStaticField(PatternOptionBuilder.class, "DATE_VALUE", prevDATE_VALUE);
            setStaticField(PatternOptionBuilder.class, "CLASS_VALUE", prevCLASS_VALUE);
            setStaticField(PatternOptionBuilder.class, "EXISTING_FILE_VALUE", prevEXISTING_FILE_VALUE);
            setStaticField(PatternOptionBuilder.class, "FILE_VALUE", prevFILE_VALUE);
            setStaticField(PatternOptionBuilder.class, "FILES_VALUE", prevFILES_VALUE);
            setStaticField(PatternOptionBuilder.class, "URL_VALUE", prevURL_VALUE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createValue(java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (PatternOptionBuilder.STRING_VALUE == clazz): False}
 * @utbot.executesCondition {@code (PatternOptionBuilder.OBJECT_VALUE == clazz): True}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createObject(java.lang.String)}
 * @utbot.returnsFrom {@code return createObject(str);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return createObject(str);
 *  */
    @Test
    public void testCreateValue_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            
            /* This test fails because method [org.apache.commons.cli.TypeHandler.createValue] produces [java.lang.NullPointerException]
                java.base/java.lang.Class.forName0(Native Method)
                java.base/java.lang.Class.forName(Class.java:375)
                org.apache.commons.cli.TypeHandler.createObject(TypeHandler.java:116)
                org.apache.commons.cli.TypeHandler.createValue(TypeHandler.java:67) */
            TypeHandler.createValue(((String) null), objectValue);
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createValue(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return createValue(str, (Class) obj);}
 *  */
    @Test
    public void testCreateValue_ReturnCreateValue() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        try {
            Class stringValue = Object.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            
            Object actual = TypeHandler.createValue(((String) null), ((Object) stringValue));
            
            assertNull(actual);
            
            Class finalStringValue = stringValue;
            
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.returnsFrom {@code return createValue(str, (Class) obj);}
 *  */
    @Test
    public void testCreateValue_TypeHandlerCreateValue() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        Class prevNUMBER_VALUE = PatternOptionBuilder.NUMBER_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            setStaticField(patternOptionBuilderClazz, "NUMBER_VALUE", objectValue);
            String string = "";
            
            Object actual = TypeHandler.createValue(string, ((Object) objectValue));
            
            assertNull(actual);
            
            Class finalObjectValue = objectValue;
            
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
            setStaticField(PatternOptionBuilder.class, "NUMBER_VALUE", prevNUMBER_VALUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.returnsFrom {@code return createValue(str, (Class) obj);}
 *  */
    @Test
    public void testCreateValue_ReturnCreateValue_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        Class prevNUMBER_VALUE = PatternOptionBuilder.NUMBER_VALUE;
        Class prevDATE_VALUE = PatternOptionBuilder.DATE_VALUE;
        Class prevCLASS_VALUE = PatternOptionBuilder.CLASS_VALUE;
        Class prevEXISTING_FILE_VALUE = PatternOptionBuilder.EXISTING_FILE_VALUE;
        Class prevFILE_VALUE = PatternOptionBuilder.FILE_VALUE;
        Class prevFILES_VALUE = PatternOptionBuilder.FILES_VALUE;
        Class prevURL_VALUE = PatternOptionBuilder.URL_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            Class numberValue = Number.class;
            setStaticField(patternOptionBuilderClazz, "NUMBER_VALUE", numberValue);
            Class dateValue = Date.class;
            setStaticField(patternOptionBuilderClazz, "DATE_VALUE", dateValue);
            Class classValue = Class.class;
            setStaticField(patternOptionBuilderClazz, "CLASS_VALUE", classValue);
            Class existingFileValue = java.io.FileInputStream.class;
            setStaticField(patternOptionBuilderClazz, "EXISTING_FILE_VALUE", existingFileValue);
            Class fileValue = java.io.File[].class;
            setStaticField(patternOptionBuilderClazz, "FILE_VALUE", fileValue);
            setStaticField(patternOptionBuilderClazz, "FILES_VALUE", fileValue);
            Class urlValue = URL.class;
            setStaticField(patternOptionBuilderClazz, "URL_VALUE", urlValue);
            
            Object actual = TypeHandler.createValue(((String) null), ((Object) null));
            
            assertNull(actual);
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
            setStaticField(PatternOptionBuilder.class, "NUMBER_VALUE", prevNUMBER_VALUE);
            setStaticField(PatternOptionBuilder.class, "DATE_VALUE", prevDATE_VALUE);
            setStaticField(PatternOptionBuilder.class, "CLASS_VALUE", prevCLASS_VALUE);
            setStaticField(PatternOptionBuilder.class, "EXISTING_FILE_VALUE", prevEXISTING_FILE_VALUE);
            setStaticField(PatternOptionBuilder.class, "FILE_VALUE", prevFILE_VALUE);
            setStaticField(PatternOptionBuilder.class, "FILES_VALUE", prevFILES_VALUE);
            setStaticField(PatternOptionBuilder.class, "URL_VALUE", prevURL_VALUE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createValue(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return createValue(str, (Class) obj);
 *  */
    @Test
    public void testCreateValue_ThrowClassCastException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Class ([B and java.lang.Class are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli.TypeHandler.createValue(TypeHandler.java:47) */
        TypeHandler.createValue(((String) null), byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.invokes {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Class)}
 * @utbot.returnsFrom {@code return createValue(str, (Class) obj);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return createValue(str, (Class) obj);
 *  */
    @Test
    public void testCreateValue_ThrowNullPointerException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class prevSTRING_VALUE = PatternOptionBuilder.STRING_VALUE;
        Class prevOBJECT_VALUE = PatternOptionBuilder.OBJECT_VALUE;
        try {
            Class stringValue = String.class;
            Class patternOptionBuilderClazz = Class.forName("org.apache.commons.cli.PatternOptionBuilder");
            setStaticField(patternOptionBuilderClazz, "STRING_VALUE", stringValue);
            Class objectValue = Object.class;
            setStaticField(patternOptionBuilderClazz, "OBJECT_VALUE", objectValue);
            
            /* This test fails because method [org.apache.commons.cli.TypeHandler.createValue] produces [java.lang.NullPointerException]
                java.base/java.lang.Class.forName0(Native Method)
                java.base/java.lang.Class.forName(Class.java:375)
                org.apache.commons.cli.TypeHandler.createObject(TypeHandler.java:116)
                org.apache.commons.cli.TypeHandler.createValue(TypeHandler.java:67)
                org.apache.commons.cli.TypeHandler.createValue(TypeHandler.java:47) */
            TypeHandler.createValue(((String) null), ((Object) objectValue));
        } finally {
            setStaticField(PatternOptionBuilder.class, "STRING_VALUE", prevSTRING_VALUE);
            setStaticField(PatternOptionBuilder.class, "OBJECT_VALUE", prevOBJECT_VALUE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createFiles
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFiles(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createFiles(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateFiles_ReturnNull() {
        java.io.File[] actual = TypeHandler.createFiles(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createURL
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createURL(java.lang.String)
    
    @Test
    public void testCreateURL1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001\u0001\u0001";
        
        URL actual = TypeHandler.createURL(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createFile(java.lang.String)}
 * @utbot.returnsFrom {@code return new File(str);}
 *  */
    @Test
    public void testCreateFile_Return() throws Exception  {
        String string = "";
        
        File actual = TypeHandler.createFile(string);
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createFile(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new File(str);
 *  */
    @Test
    public void testCreateFile_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createFile] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            org.apache.commons.cli.TypeHandler.createFile(TypeHandler.java:239) */
        TypeHandler.createFile(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createObject(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createObject(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#forName(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#newInstance()}
 * @utbot.returnsFrom {@code return instance;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return instance;
 *  */
    @Test
    public void testCreateObject_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createObject] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:375)
            org.apache.commons.cli.TypeHandler.createObject(TypeHandler.java:116) */
        TypeHandler.createObject(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields837059327930400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields837059327930400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass837059327942900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields837059327930400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass837059327942900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


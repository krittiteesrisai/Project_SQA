package org.apache.commons.cli;

import org.junit.Test;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_TypeHandlerTest {
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createURL
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createURL(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createURL(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.cli.ParseException} in:  catch (final MalformedURLException e) {
 *     throw new ParseException("Unable to parse the URL: " + str);
 * }
 *  */
    @Test(expected = ParseException.class)
    public void testCreateURL_ThrowParseException() throws ParseException  {
        String string = "";
        
        TypeHandler.createURL(string);
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
            org.apache.commons.cli.TypeHandler.createFile(TypeHandler.java:224) */
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
 * @utbot.returnsFrom {@code return cl.newInstance();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cl.newInstance();
 *  */
    @Test
    public void testCreateObject_ThrowNullPointerException() throws ParseException  {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createObject] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:375)
            org.apache.commons.cli.TypeHandler.createObject(TypeHandler.java:121) */
        TypeHandler.createObject(null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method createObject(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.TypeHandler}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createObject(java.lang.String)}
     */
    @Test(expected = ParseException.class)
    public void testCreateObjectThrowsPEWithNonEmptyString() throws ParseException  {
        TypeHandler.createObject("XZb");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createNumber
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (str.indexOf('.') != -1): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.NumberFormatException#getMessage()}
 * @utbot.caughtException {@code final NumberFormatException e}
 * @utbot.throwsException {@link org.apache.commons.cli.ParseException} in:  catch (final NumberFormatException e) {
 *     throw new ParseException(e.getMessage());
 * }
 *  */
    @Test(expected = ParseException.class)
    public void testCreateNumber_ThrowParseException() throws ParseException  {
        String string = "";
        
        TypeHandler.createNumber(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.indexOf('.') != -1
 *  */
    @Test
    public void testCreateNumber_ThrowNullPointerException() throws ParseException  {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createNumber] produces [java.lang.NullPointerException]
            org.apache.commons.cli.TypeHandler.createNumber(TypeHandler.java:150) */
        TypeHandler.createNumber(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.TypeHandler}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberWithNonEmptyString() throws ParseException  {
        Long actual = ((Long) TypeHandler.createNumber("-3"));
        
        Long expected = -3L;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    @Test
    public void testCreateNumber1() throws ParseException  {
        String string = "-0.";
        
        Double actual = ((Double) TypeHandler.createNumber(string));
        
        Double expected = -0.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createNumber(java.lang.String)
    
    @Test(expected = ParseException.class)
    public void testCreateNumber2() throws ParseException  {
        String string = "\u0001\u0001.\u0001\u0001\u0001";
        
        TypeHandler.createNumber(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createValue(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return createValue(str, (Class<?>) obj);
 *  */
    @Test
    public void testCreateValue_ThrowClassCastException() throws ParseException  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Class ([B and java.lang.Class are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli.TypeHandler.createValue(TypeHandler.java:51) */
        TypeHandler.createValue(((String) null), byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createValue(java.lang.String, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.TypeHandler}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createValue(java.lang.String,java.lang.Object)}
     */
    @Test
    public void testCreateValueWithNonEmptyString() throws ParseException  {
        Object actual = TypeHandler.createValue("bc", ((Object) null));
        
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
 * @utbot.returnsFrom {@code return Class.forName(classname);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Class.forName(classname);
 *  */
    @Test
    public void testCreateClass_ThrowNullPointerException() throws ParseException  {
        /* This test fails because method [org.apache.commons.cli.TypeHandler.createClass] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:375)
            org.apache.commons.cli.TypeHandler.createClass(TypeHandler.java:173) */
        TypeHandler.createClass(null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method createClass(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.TypeHandler}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createClass(java.lang.String)}
     */
    @Test(expected = ParseException.class)
    public void testCreateClassThrowsPEWithNonEmptyString() throws ParseException  {
        TypeHandler.createClass("XZb");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createDate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createDate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Not yet implemented");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_ThrowUnsupportedOperationException() {
        TypeHandler.createDate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.TypeHandler.createFiles
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFiles(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeHandler}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.TypeHandler#createFiles(java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Not yet implemented");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_ThrowUnsupportedOperationException() {
        TypeHandler.createFiles(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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


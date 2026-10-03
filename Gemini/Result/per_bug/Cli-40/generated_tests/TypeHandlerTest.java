package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;
import java.util.Vector;

public class TypeHandlerTest {

    @Test
    public void testCreateValueString() throws ParseException {
        Object result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValueObject() throws ParseException {
        Object result = TypeHandler.createValue("java.util.Vector", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof Vector);
    }

    @Test
    public void testCreateValueNumber() throws ParseException {
        Object doubleResult = TypeHandler.createValue("123.45", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Double.valueOf(123.45), doubleResult);

        Object longResult = TypeHandler.createValue("123", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(123), longResult);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueDate() throws ParseException {
        TypeHandler.createValue("2023-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValueClass() throws ParseException {
        Object result = TypeHandler.createValue("java.util.Date", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(Date.class, result);
    }

    @Test
    public void testCreateValueFile() throws ParseException {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValueExistingFile() throws Exception {
        File tempFile = File.createTempFile("cli-test", ".tmp");
        tempFile.deleteOnExit();
        Object result = TypeHandler.createValue(tempFile.getAbsolutePath(), PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof FileInputStream);
        ((FileInputStream) result).close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueFiles() throws ParseException {
        TypeHandler.createValue("file1.txt,file2.txt", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValueURL() throws ParseException {
        Object result = TypeHandler.createValue("http://commons.apache.org", PatternOptionBuilder.URL_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof URL);
        assertEquals("http://commons.apache.org", result.toString());
    }

    @Test
    public void testCreateValueDefaultNull() throws ParseException {
        // Passing an unrecognized Class to hit the final 'else' branch returning null
        Class<?> unknownClass = String.class; 
        // Wait, STRING_VALUE is String.class. Let's use an arbitrary class object not mapped.
        // PatternOptionBuilder constants are objects, but createValue checks Class<?>
        // Let's pass a dummy Class like TypeHandlerTest.class
        Object result = TypeHandler.createValue("test", TypeHandlerTest.class);
        assertNull(result);
    }

    @Test
    public void testCreateValueWithObjectParamOverload() throws ParseException {
        // Testing public static Object createValue(final String str, final Object obj)
        Object result = TypeHandler.createValue("100", (Object) PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(100), result);
    }

    @Test
    public void testCreateObjectSuccess() throws ParseException {
        Object obj = TypeHandler.createObject("java.util.Vector");
        assertTrue(obj instanceof Vector);
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectClassNotFound() throws ParseException {
        TypeHandler.createObject("non.existent.ClassName");
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectInstantiationException() throws ParseException {
        // Date(String) requires arguments, no empty constructor failure simulation or abstract class
        TypeHandler.createObject("java.util.Date");
    }

    @Test
    public void testCreateNumberDouble() throws ParseException {
        Number num = TypeHandler.createNumber("45.67");
        assertTrue(num instanceof Double);
        assertEquals(45.67, num.doubleValue(), 0.001);
    }

    @Test
    public void testCreateNumberLong() throws ParseException {
        Number num = TypeHandler.createNumber("987654321");
        assertTrue(num instanceof Long);
        assertEquals(987654321L, num.longValue());
    }

    @Test(expected = ParseException.class)
    public void testCreateNumberInvalid() throws ParseException {
        TypeHandler.createNumber("not-a-number");
    }

    @Test
    public void testCreateClassSuccess() throws ParseException {
        Class<?> clazz = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateClassNodeFound() throws ParseException {
        TypeHandler.createClass("non.existent.Class");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDateThrowsException() {
        TypeHandler.createDate("2023-01-01");
    }

    @Test
    public void testCreateURLSuccess() throws ParseException {
        URL url = TypeHandler.createURL("https://github.com");
        assertNotNull(url);
        assertEquals("https://github.com", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURLMalformed() throws ParseException {
        TypeHandler.createURL("ht!tp://invalid-url");
    }

    @Test
    public void testCreateFile() {
        File file = TypeHandler.createFile("dummy/path.txt");
        assertNotNull(file);
        assertEquals("path.txt", file.getName());
    }

    @Test
    public void testOpenFileSuccess() throws Exception {
        File tempFile = File.createTempFile("open-test", ".tmp");
        tempFile.deleteOnExit();
        FileInputStream fis = TypeHandler.openFile(tempFile.getAbsolutePath());
        assertNotNull(fis);
        fis.close();
    }

    @Test(expected = ParseException.class)
    public void testOpenFileNodeFound() throws ParseException {
        TypeHandler.openFile("non-existent-file-123456789.txt");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFilesThrowsException() {
        TypeHandler.createFiles("path1,path2");
    }
}
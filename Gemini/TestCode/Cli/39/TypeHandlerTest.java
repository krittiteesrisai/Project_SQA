package org.apache.commons.cli;

import org.junit.Test;
import java.io.File;
import java.net.URL;
import java.util.Date;

import static org.junit.Assert.*;

public class TypeHandlerTest {

    @Test
    public void testCreateValueWithString() throws ParseException {
        Object result = TypeHandler.createValue("testString", PatternOptionBuilder.STRING_VALUE);
        assertEquals("testString", result);
    }

    @Test
    public void testCreateValueWithObject() throws ParseException {
        Object result = TypeHandler.createValue("java.util.Date", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof Date);
    }

    @Test
    public void testCreateValueWithNumberDouble() throws ParseException {
        Object result = TypeHandler.createValue("123.45", PatternOptionBuilder.NUMBER_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof Double);
        assertEquals(123.45, (Double) result, 0.001);
    }

    @Test
    public void testCreateValueWithNumberLong() throws ParseException {
        Object result = TypeHandler.createValue("12345", PatternOptionBuilder.NUMBER_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof Long);
        assertEquals(12345L, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueWithDate() throws ParseException {
        TypeHandler.createValue("2023-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValueWithClass() throws ParseException {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValueWithFile() throws ParseException {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValueWithExistingFile() throws ParseException {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueWithFiles() throws ParseException {
        TypeHandler.createValue("test1.txt,test2.txt", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValueWithURL() throws ParseException {
        Object result = TypeHandler.createValue("http://commons.apache.org", PatternOptionBuilder.URL_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof URL);
        assertEquals("http://commons.apache.org", result.toString());
    }

    @Test
    public void testCreateValueWithUnknownType() throws ParseException {
        // ทดสอบกิ่ง else คืนค่า null เมื่อ Class ไม่ตรงกับ PatternOptionBuilder ใดๆ
        Class<?> unknownClass = Integer.class;
        Object result = TypeHandler.createValue("123", unknownClass);
        assertNull(result);
    }

    @Test
    public void testCreateValueWithObjectWrapperMethod() throws ParseException {
        // ทดสอบเมธอด overloading ที่รับ Object แทน Class<?>
        Object result = TypeHandler.createValue("testString", (Object) PatternOptionBuilder.STRING_VALUE);
        assertEquals("testString", result);
    }

    @Test
    public void testCreateObjectSuccess() throws ParseException {
        Object obj = TypeHandler.createObject("java.util.Date");
        assertNotNull(obj);
        assertTrue(obj instanceof Date);
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectClassNotFound() throws ParseException {
        TypeHandler.createObject("org.apache.commons.cli.NonExistentClass");
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectInstantiationException() throws ParseException {
        // java.io.File ไม่มี default constructor แบบไม่มีพารามิเตอร์ จะต้องโยน ParseException ออกมา
        TypeHandler.createObject("java.io.File");
    }

    @Test
    public void testCreateNumberWithDot() throws ParseException {
        Number num = TypeHandler.createNumber("456.78");
        assertTrue(num instanceof Double);
        assertEquals(456.78, num.doubleValue(), 0.001);
    }

    @Test
    public void testCreateNumberWithoutDot() throws ParseException {
        Number num = TypeHandler.createNumber("45678");
        assertTrue(num instanceof Long);
        assertEquals(45678L, num.longValue());
    }

    @Test(expected = ParseException.class)
    public void testCreateNumberInvalidFormat() throws ParseException {
        TypeHandler.createNumber("not-a-number");
    }

    @Test
    public void testCreateClassSuccess() throws ParseException {
        Class<?> clazz = TypeHandler.createClass("java.lang.Boolean");
        assertEquals(Boolean.class, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateClassClassNotFound() throws ParseException {
        TypeHandler.createClass("org.apache.commons.cli.NonExistentClass");
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
        File file = TypeHandler.createFile("/path/to/file.txt");
        assertNotNull(file);
        assertEquals("/path/to/file.txt", file.getPath());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFilesThrowsException() {
        TypeHandler.createFiles("file1.txt");
    }
}
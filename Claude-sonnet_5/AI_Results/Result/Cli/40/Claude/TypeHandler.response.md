# TypeHandlerTest.java

```java
package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.apache.commons.cli.TypeHandler (Defects4J Cli-40b)
 *
 * หมายเหตุสำคัญ (fault-detection):
 * ในซอร์สโค้ดของ commons-cli เวอร์ชันที่มีบั๊ก Cli-40 ค่า PatternOptionBuilder.FILE_VALUE
 * และ PatternOptionBuilder.EXISTING_FILE_VALUE อาจอ้างอิงไปที่ Class object เดียวกัน
 * (File.class) เนื่องจากลำดับการเช็คใน if/else ของ createValue(String, Class<T>)
 * จะเช็ค FILE_VALUE ก่อน EXISTING_FILE_VALUE เสมอ ผลคือเมื่อเรียกด้วย
 * EXISTING_FILE_VALUE อาจไปเข้า branch createFile() (คืนค่า File) แทนที่จะเป็น
 * openFile() (คืนค่า FileInputStream) ตามที่ Javadoc ระบุไว้
 * เทสนี้เขียนตาม "สัญญา" ของ Javadoc (คาดหวัง FileInputStream) จึงมีโอกาส FAIL
 * ได้จริงหากบั๊กนี้ยังคงอยู่ในซอร์สที่ทดสอบ — ถือเป็นจุดประสงค์ของการดักจับ fault
 */
public class TypeHandlerTest
{
    private File existingFile;

    @Before
    public void setUp() throws IOException
    {
        existingFile = File.createTempFile("typeHandlerTest", ".tmp");
        existingFile.deleteOnExit();
    }

    @After
    public void tearDown()
    {
        if (existingFile != null && existingFile.exists())
        {
            existingFile.delete();
        }
    }

    // ===================== createValue(String, Object) =====================

    @Test
    public void testCreateValue_ObjectOverload_DelegatesToClassOverload() throws ParseException
    {
        Object result = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    // ================= createValue(String, Class<T>) branches =================

    @Test
    public void testCreateValue_StringValue() throws ParseException
    {
        Object result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValue_ObjectValue_Success() throws ParseException
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.OBJECT_VALUE);
        assertTrue(result instanceof String);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_ObjectValue_ClassNotFound() throws ParseException
    {
        TypeHandler.createValue("no.such.Class", PatternOptionBuilder.OBJECT_VALUE);
    }

    @Test
    public void testCreateValue_NumberValue_Long() throws ParseException
    {
        Object result = TypeHandler.createValue("15", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Long);
        assertEquals(15L, result);
    }

    @Test
    public void testCreateValue_NumberValue_Double() throws ParseException
    {
        Object result = TypeHandler.createValue("15.5", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Double);
        assertEquals(15.5d, (Double) result, 0.0001);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_NumberValue_Invalid() throws ParseException
    {
        TypeHandler.createValue("not-a-number", PatternOptionBuilder.NUMBER_VALUE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_DateValue_NotImplemented() throws ParseException
    {
        TypeHandler.createValue("2024-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValue_ClassValue_Success() throws ParseException
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_ClassValue_NotFound() throws ParseException
    {
        TypeHandler.createValue("no.such.Class", PatternOptionBuilder.CLASS_VALUE);
    }

    @Test
    public void testCreateValue_FileValue() throws ParseException
    {
        Object result = TypeHandler.createValue("somepath.txt", PatternOptionBuilder.FILE_VALUE);
        assertTrue(result instanceof File);
        assertEquals("somepath.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValue_ExistingFileValue_Success() throws ParseException
    {
        // ดู note ด้านบนคลาส: อาจ FAIL หากมีบั๊ก Cli-40 (FILE_VALUE ชนกับ EXISTING_FILE_VALUE)
        Object result = TypeHandler.createValue(existingFile.getAbsolutePath(),
                PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertTrue("Expected FileInputStream ตาม Javadoc contract (อาจ fail จากบั๊ก Cli-40)",
                result instanceof FileInputStream);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_ExistingFileValue_NotFound() throws ParseException
    {
        TypeHandler.createValue("/no/such/file/exists.xyz", PatternOptionBuilder.EXISTING_FILE_VALUE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_FilesValue_NotImplemented() throws ParseException
    {
        TypeHandler.createValue("file1,file2", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValue_UrlValue_Success() throws ParseException
    {
        Object result = TypeHandler.createValue("http://apache.org", PatternOptionBuilder.URL_VALUE);
        assertTrue(result instanceof URL);
        assertEquals("http://apache.org", result.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_UrlValue_Malformed() throws ParseException
    {
        TypeHandler.createValue("bogus url with no protocol", PatternOptionBuilder.URL_VALUE);
    }

    @Test
    public void testCreateValue_UnknownClass_ReturnsNull() throws ParseException
    {
        // ไม่ตรงกับ constant ใดๆ ใน PatternOptionBuilder -> else branch -> null
        Object result = TypeHandler.createValue("anything", Boolean.class);
        assertNull(result);
    }

    // ========================= createObject =========================

    @Test
    public void testCreateObject_Success() throws ParseException
    {
        Object obj = TypeHandler.createObject("java.lang.Object");
        assertNotNull(obj);
        assertEquals(Object.class, obj.getClass());
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_ClassNotFound() throws ParseException
    {
        TypeHandler.createObject("com.does.not.Exist");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_InstantiationException() throws ParseException
    {
        // interface -> newInstance() throws InstantiationException -> ParseException
        TypeHandler.createObject("java.util.Map");
    }

    // ========================= createNumber =========================

    @Test
    public void testCreateNumber_Long() throws ParseException
    {
        Number n = TypeHandler.createNumber("123");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_Double() throws ParseException
    {
        Number n = TypeHandler.createNumber("123.456");
        assertTrue(n instanceof Double);
        assertEquals(123.456, n.doubleValue(), 0.0001);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_InvalidLong() throws ParseException
    {
        TypeHandler.createNumber("abc");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_InvalidDouble() throws ParseException
    {
        TypeHandler.createNumber("12.3.4");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_EmptyString() throws ParseException
    {
        // ไม่มี '.' -> Long.valueOf("") -> NumberFormatException
        TypeHandler.createNumber("");
    }

    // ========================= createClass =========================

    @Test
    public void testCreateClass_Success() throws ParseException
    {
        Class<?> cl = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, cl);
    }

    @Test(expected = ParseException.class)
    public void testCreateClass_NotFound() throws ParseException
    {
        TypeHandler.createClass("no.such.Klass");
    }

    // ========================= createDate =========================

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_AlwaysThrows()
    {
        TypeHandler.createDate("2024-01-01");
    }

    // ========================= createURL =========================

    @Test
    public void testCreateURL_Success() throws ParseException
    {
        URL url = TypeHandler.createURL("http://apache.org");
        assertNotNull(url);
        assertEquals("http://apache.org", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_Malformed() throws ParseException
    {
        TypeHandler.createURL("bogus url with no protocol");
    }

    // ========================= createFile =========================

    @Test
    public void testCreateFile()
    {
        File f = TypeHandler.createFile("somefile.txt");
        assertNotNull(f);
        assertEquals("somefile.txt", f.getName());
    }

    // ========================= openFile =========================

    @Test
    public void testOpenFile_Success() throws ParseException, IOException
    {
        FileInputStream fis = TypeHandler.openFile(existingFile.getAbsolutePath());
        assertNotNull(fis);
        fis.close();
    }

    @Test(expected = ParseException.class)
    public void testOpenFile_NotFound() throws ParseException
    {
        TypeHandler.openFile("/no/such/file/exists.xyz");
    }

    // ========================= createFiles =========================

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_AlwaysThrows()
    {
        TypeHandler.createFiles("file1,file2");
    }
}
```

---

## สรุปตาราง Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateValue_ObjectOverload_DelegatesToClassOverload` | `createValue(String,Object)` → cast → delegate |
| `testCreateValue_StringValue` | if `STRING_VALUE == clazz` |
| `testCreateValue_ObjectValue_Success` / `_ClassNotFound` | if `OBJECT_VALUE == clazz` → success / ClassNotFoundException path |
| `testCreateValue_NumberValue_Long` / `_Double` / `_Invalid` | if `NUMBER_VALUE == clazz` → long/double/NFE paths |
| `testCreateValue_DateValue_NotImplemented` | if `DATE_VALUE == clazz` → UnsupportedOperationException |
| `testCreateValue_ClassValue_Success` / `_NotFound` | if `CLASS_VALUE == clazz` → success/failure |
| `testCreateValue_FileValue` | if `FILE_VALUE == clazz` |
| `testCreateValue_ExistingFileValue_Success` / `_NotFound` | if `EXISTING_FILE_VALUE == clazz` (ดักจับ fault Cli-40) |
| `testCreateValue_FilesValue_NotImplemented` | if `FILES_VALUE == clazz` → UnsupportedOperationException |
| `testCreateValue_UrlValue_Success` / `_Malformed` | if `URL_VALUE == clazz` → success/MalformedURLException |
| `testCreateValue_UnknownClass_ReturnsNull` | else branch → return null |
| `testCreateObject_Success` / `_ClassNotFound` / `_InstantiationException` | try/catch `ClassNotFoundException`, try/catch `Exception` ใน `createObject` |
| `testCreateNumber_Long` / `_Double` / `_InvalidLong` / `_InvalidDouble` / `_EmptyString` | if `str.indexOf('.') != -1`, try/catch `NumberFormatException` |
| `testCreateClass_Success` / `_NotFound` | try/catch `ClassNotFoundException` ใน `createClass` |
| `testCreateDate_AlwaysThrows` | `createDate` throw เสมอ |
| `testCreateURL_Success` / `_Malformed` | try/catch `MalformedURLException` ใน `createURL` |
| `testCreateFile` | `createFile` (ไม่มี branch, ทดสอบ path ปกติ) |
| `testOpenFile_Success` / `_NotFound` | try/catch `FileNotFoundException` ใน `openFile` |
| `testCreateFiles_AlwaysThrows` | `createFiles` throw เสมอ |

**หมายเหตุ:** เมธอด `createDate` และ `createFiles` ไม่มี branch ภายใน (throw เสมอ) — เทสจึงครอบคลุมแค่ path เดียวที่มีตามซอร์ส ไม่มีการเดา behavior เพิ่มเติม
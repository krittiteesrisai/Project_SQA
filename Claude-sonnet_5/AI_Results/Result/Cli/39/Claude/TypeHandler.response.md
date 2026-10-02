# TypeHandlerTest.java

```java
package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for {@link TypeHandler} (Defects4J Cli-39b).
 *
 * หมายเหตุ: ค่าคงที่ของ PatternOptionBuilder (STRING_VALUE, OBJECT_VALUE, ฯลฯ)
 * ไม่ได้แสดงในซอร์สโค้ดที่ให้มา แต่ถูกอ้างอิงโดยตรงจากคลาส PatternOptionBuilder
 * ที่อยู่ใน classpath จริง (ไม่ได้เดาค่า) เพื่อไม่ให้เกิดการ hardcode ผิดพลาด
 */
public class TypeHandlerTest
{
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ---------------------------------------------------------------
    // createValue(String, Object) -> delegate to createValue(String, Class<?>)
    // ---------------------------------------------------------------

    @Test
    public void testCreateValue_ObjectOverload_DelegatesToClassOverload() throws ParseException
    {
        Object result = TypeHandler.createValue("42", (Object) PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(42), result);
    }

    @Test
    public void testCreateValue_ObjectOverload_NonClassObject_ThrowsClassCastException()
    {
        // obj ไม่ใช่ Class<?> -> cast ภายในเมธอดต้องล้มเหลวด้วย ClassCastException
        try
        {
            TypeHandler.createValue("foo", new Object());
            fail("Expected ClassCastException due to unchecked cast");
        }
        catch (final ClassCastException expected)
        {
            // fault-detection: ยืนยันว่า cast ผิดพลาดจริง
        }
        catch (final ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // createValue(String, Class<?>) - แต่ละ branch ของ if/else if
    // ---------------------------------------------------------------

    @Test
    public void testCreateValue_StringValue() throws ParseException
    {
        Object result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValue_ObjectValue_Success() throws ParseException
    {
        Object result = TypeHandler.createValue("java.lang.Object", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertEquals(Object.class, result.getClass());
    }

    @Test
    public void testCreateValue_NumberValue_Long() throws ParseException
    {
        Object result = TypeHandler.createValue("5", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(5), result);
    }

    @Test
    public void testCreateValue_NumberValue_Double() throws ParseException
    {
        Object result = TypeHandler.createValue("5.5", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Double.valueOf(5.5), result);
    }

    @Test
    public void testCreateValue_DateValue_AlwaysThrowsUnsupported()
    {
        thrown.expect(UnsupportedOperationException.class);
        // createDate ถูกเรียกภายใน createValue แต่ throw exception แบบ unchecked
        // ทำให้ signature ที่ declare ParseException ไม่ครอบคลุมกรณีนี้
        try
        {
            TypeHandler.createValue("2020-01-01", PatternOptionBuilder.DATE_VALUE);
        }
        catch (final ParseException e)
        {
            fail("Unexpected ParseException; expected UnsupportedOperationException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateValue_ClassValue_Success() throws ParseException
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_FileValue() throws ParseException
    {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValue_ExistingFileValue() throws ParseException
    {
        // หมายเหตุ: ในซอร์สคอมมอนส์-cli จริง EXISTING_FILE_VALUE มีค่าเท่ากับ FILE_VALUE (File.class)
        // ดังนั้น branch นี้อาจไม่ถูกเข้าถึงจริงเพราะ FILE_VALUE ตรวจก่อนแล้ว (fault ที่ควรสังเกต)
        Object result = TypeHandler.createValue("exists.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertTrue(result instanceof File);
    }

    @Test
    public void testCreateValue_FilesValue_AlwaysThrowsUnsupported()
    {
        thrown.expect(UnsupportedOperationException.class);
        try
        {
            TypeHandler.createValue("a.txt,b.txt", PatternOptionBuilder.FILES_VALUE);
        }
        catch (final ParseException e)
        {
            fail("Unexpected ParseException; expected UnsupportedOperationException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateValue_UrlValue_Valid() throws ParseException
    {
        Object result = TypeHandler.createValue("http://apache.org", PatternOptionBuilder.URL_VALUE);
        assertTrue(result instanceof URL);
        assertEquals("http://apache.org", result.toString());
    }

    @Test
    public void testCreateValue_UrlValue_Malformed()
    {
        try
        {
            TypeHandler.createValue("not a valid url", PatternOptionBuilder.URL_VALUE);
            fail("Expected ParseException for malformed URL");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().startsWith("Unable to parse the URL:"));
        }
    }

    @Test
    public void testCreateValue_UnknownClass_ReturnsNull() throws ParseException
    {
        // Integer.class ไม่ตรงกับ constant ใด ๆ ใน PatternOptionBuilder -> เข้า else -> null
        Object result = TypeHandler.createValue("123", Integer.class);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // createObject(String)
    // ---------------------------------------------------------------

    @Test
    public void testCreateObject_Success() throws ParseException
    {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
        assertEquals(Object.class, result.getClass());
    }

    @Test
    public void testCreateObject_ClassNotFound_ThrowsParseException()
    {
        try
        {
            TypeHandler.createObject("no.such.Class.Really");
            fail("Expected ParseException for missing class");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().startsWith("Unable to find the class:"));
        }
    }

    @Test
    public void testCreateObject_InstantiationException_AbstractClass_ThrowsParseException()
    {
        // java.lang.Number เป็น abstract class -> newInstance() ควร throw InstantiationException
        try
        {
            TypeHandler.createObject("java.lang.Number");
            fail("Expected ParseException due to InstantiationException");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().contains("Unable to create an instance of: java.lang.Number"));
        }
    }

    @Test
    public void testCreateObject_IllegalAccessException_PrivateConstructor_ThrowsParseException()
    {
        // java.lang.Void มี constructor เป็น private -> newInstance() ควร throw IllegalAccessException
        try
        {
            TypeHandler.createObject("java.lang.Void");
            fail("Expected ParseException due to IllegalAccessException");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().contains("Unable to create an instance of: java.lang.Void"));
        }
    }

    // ---------------------------------------------------------------
    // createNumber(String)
    // ---------------------------------------------------------------

    @Test
    public void testCreateNumber_WithoutDot_ReturnsLong() throws ParseException
    {
        Number result = TypeHandler.createNumber("100");
        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(100), result);
    }

    @Test
    public void testCreateNumber_WithDot_ReturnsDouble() throws ParseException
    {
        Number result = TypeHandler.createNumber("100.5");
        assertTrue(result instanceof Double);
        assertEquals(Double.valueOf(100.5), result);
    }

    @Test
    public void testCreateNumber_DotOnlyBoundary_ReturnsDouble() throws ParseException
    {
        // boundary: '.' present but no fraction digits, still parseable ("5.")
        Number result = TypeHandler.createNumber("5.");
        assertEquals(Double.valueOf(5.0), result);
    }

    @Test
    public void testCreateNumber_InvalidLong_ThrowsParseException()
    {
        try
        {
            TypeHandler.createNumber("abc");
            fail("Expected ParseException for invalid long format");
        }
        catch (final ParseException expected)
        {
            // ok
        }
    }

    @Test
    public void testCreateNumber_InvalidDouble_ThrowsParseException()
    {
        try
        {
            TypeHandler.createNumber("5.5.5");
            fail("Expected ParseException for invalid double format");
        }
        catch (final ParseException expected)
        {
            // ok
        }
    }

    @Test
    public void testCreateNumber_EmptyString_ThrowsParseException()
    {
        // boundary case: empty string, no '.' -> Long.valueOf("") throws NumberFormatException
        try
        {
            TypeHandler.createNumber("");
            fail("Expected ParseException for empty string");
        }
        catch (final ParseException expected)
        {
            // ok
        }
    }

    @Test
    public void testCreateNumber_NullString_ThrowsNullPointerException()
    {
        // หมายเหตุ: str.indexOf('.') บน null จะ throw NullPointerException ทันที
        // ซึ่งไม่ได้ถูกจับและแปลงเป็น ParseException ตามซอร์สที่ให้มา (behavior ที่สังเกตได้จากโค้ด)
        try
        {
            TypeHandler.createNumber(null);
            fail("Expected NullPointerException for null input");
        }
        catch (final NullPointerException expected)
        {
            // ok - matches actual code behavior (no null check present)
        }
        catch (final ParseException e)
        {
            fail("Unexpected ParseException; NPE was expected per source code: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // createClass(String)
    // ---------------------------------------------------------------

    @Test
    public void testCreateClass_Success() throws ParseException
    {
        Class<?> result = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateClass_NotFound_ThrowsParseException()
    {
        try
        {
            TypeHandler.createClass("no.such.Klazz");
            fail("Expected ParseException for missing class");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().startsWith("Unable to find the class:"));
        }
    }

    // ---------------------------------------------------------------
    // createDate(String)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_AlwaysThrowsUnsupported()
    {
        TypeHandler.createDate("2020-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_NullInput_StillThrowsUnsupported()
    {
        // แม้ input เป็น null ก็ยัง throw UnsupportedOperationException เพราะยังไม่ implement
        TypeHandler.createDate(null);
    }

    // ---------------------------------------------------------------
    // createURL(String)
    // ---------------------------------------------------------------

    @Test
    public void testCreateURL_Valid() throws ParseException
    {
        URL result = TypeHandler.createURL("https://commons.apache.org");
        assertNotNull(result);
        assertEquals("https://commons.apache.org", result.toString());
    }

    @Test
    public void testCreateURL_Malformed_ThrowsParseException()
    {
        try
        {
            TypeHandler.createURL("this is not a url");
            fail("Expected ParseException for malformed URL");
        }
        catch (final ParseException expected)
        {
            assertTrue(expected.getMessage().startsWith("Unable to parse the URL:"));
        }
    }

    @Test
    public void testCreateURL_EmptyString_ThrowsParseException()
    {
        // boundary: empty string is also malformed
        try
        {
            TypeHandler.createURL("");
            fail("Expected ParseException for empty URL string");
        }
        catch (final ParseException expected)
        {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // createFile(String)
    // ---------------------------------------------------------------

    @Test
    public void testCreateFile_NormalPath()
    {
        File result = TypeHandler.createFile("some/path/file.txt");
        assertEquals("file.txt", result.getName());
    }

    @Test
    public void testCreateFile_EmptyString()
    {
        // boundary case: empty string -> File("") should not throw
        File result = TypeHandler.createFile("");
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // createFiles(String)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_AlwaysThrowsUnsupported()
    {
        TypeHandler.createFiles("a.txt,b.txt");
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateValue_ObjectOverload_DelegatesToClassOverload` | `createValue(String, Object)` delegate ไปยัง `createValue(String, Class<?>)` |
| `testCreateValue_ObjectOverload_NonClassObject_ThrowsClassCastException` | Unchecked cast `(Class<?>) obj` ล้มเหลว (fault-detection) |
| `testCreateValue_StringValue` | `if (STRING_VALUE == clazz)` = true |
| `testCreateValue_ObjectValue_Success` | `else if (OBJECT_VALUE == clazz)` = true, เรียก `createObject` สำเร็จ |
| `testCreateValue_NumberValue_Long` | `else if (NUMBER_VALUE == clazz)` = true, `createNumber` ไม่มี `.` |
| `testCreateValue_NumberValue_Double` | เหมือนบน แต่มี `.` |
| `testCreateValue_DateValue_AlwaysThrowsUnsupported` | `else if (DATE_VALUE == clazz)` = true, `createDate` throw |
| `testCreateValue_ClassValue_Success` | `else if (CLASS_VALUE == clazz)` = true |
| `testCreateValue_FileValue` | `else if (FILE_VALUE == clazz)` = true |
| `testCreateValue_ExistingFileValue` | `else if (EXISTING_FILE_VALUE == clazz)` (อาจถูกบัง branch โดย FILE_VALUE — ระบุใน comment) |
| `testCreateValue_FilesValue_AlwaysThrowsUnsupported` | `else if (FILES_VALUE == clazz)` = true |
| `testCreateValue_UrlValue_Valid` / `_Malformed` | `else if (URL_VALUE == clazz)` = true, ทั้ง try/catch ของ `createURL` |
| `testCreateValue_UnknownClass_ReturnsNull` | `else { return null; }` |
| `testCreateObject_Success` | `Class.forName` สำเร็จ + `newInstance()` สำเร็จ |
| `testCreateObject_ClassNotFound_ThrowsParseException` | `catch (ClassNotFoundException)` |
| `testCreateObject_InstantiationException_AbstractClass_ThrowsParseException` | `catch (Exception e)` จาก `InstantiationException` |
| `testCreateObject_IllegalAccessException_PrivateConstructor_ThrowsParseException` | `catch (Exception e)` จาก `IllegalAccessException` |
| `testCreateNumber_WithoutDot_ReturnsLong` | `if (indexOf('.') != -1)` = false → `Long.valueOf` |
| `testCreateNumber_WithDot_ReturnsDouble` | `if (indexOf('.') != -1)` = true → `Double.valueOf` |
| `testCreateNumber_DotOnlyBoundary_ReturnsDouble` | boundary `.` เดี่ยว |
| `testCreateNumber_InvalidLong_ThrowsParseException` | `catch (NumberFormatException)` กรณี Long |
| `testCreateNumber_InvalidDouble_ThrowsParseException` | `catch (NumberFormatException)` กรณี Double |
| `testCreateNumber_EmptyString_ThrowsParseException` | boundary ค่าว่าง |
| `testCreateNumber_NullString_ThrowsNullPointerException` | null input (ไม่ถูก handle ใน source, fault-detection) |
| `testCreateClass_Success` / `_NotFound` | `try`/`catch (ClassNotFoundException)` ของ `createClass` |
| `testCreateDate_AlwaysThrowsUnsupported` / `_NullInput` | เมธอดที่ยังไม่ implement เสมอ throw |
| `testCreateURL_Valid` / `_Malformed` / `_EmptyString` | `try`/`catch (MalformedURLException)` ของ `createURL` |
| `testCreateFile_NormalPath` / `_EmptyString` | `createFile` ไม่มี branch แต่ทดสอบ boundary input |
| `testCreateFiles_AlwaysThrowsUnsupported` | เมธอดที่ยังไม่ implement เสมอ throw |

**หมายเหตุสำคัญ:** `EXISTING_FILE_VALUE` ในคอมมอนส์-cli เวอร์ชันจริงมักมีค่าเดียวกับ `FILE_VALUE` (`File.class`) ทำให้ branch ของ `EXISTING_FILE_VALUE` ไม่ถูกเข้าถึงจริงเพราะ `FILE_VALUE` ตรวจก่อน — จุดนี้ระบุเป็นคอมเมนต์ในเทสเพื่อไม่เดา behavior เกินกว่าที่ตรวจสอบได้จากซอร์สที่ให้มา
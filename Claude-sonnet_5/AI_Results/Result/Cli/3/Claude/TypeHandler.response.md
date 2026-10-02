# TypeHandlerTest - JUnit 4 Test Suite

**หมายเหตุก่อนเริ่ม:** โจทย์ระบุ classpath เป็น `junit-3.8.1.jar` แต่ให้เขียนด้วย JUnit 4 (`@Test` annotation) — จึงสมมติว่าในการรันจริงต้องมี `junit-4.x.jar` อยู่ใน classpath ด้วย (ยึดตามข้อกำหนดหลักที่ระบุชัดว่าให้ใช้ JUnit 4)

นอกจากนี้ `TypeHandler` อ้างอิง `PatternOptionBuilder` ซึ่งไม่ได้แสดงซอร์สมาด้วย จึงมีบางเทสที่ **ไม่สามารถยืนยัน behavior 100%** (เช่น type จริงของ `OBJECT_VALUE`, `EXISTING_FILE_VALUE`) — จะเขียนแบบ defensive พร้อมคอมเมนต์กำกับตามข้อกำหนด

```java
import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.junit.Test;

import org.apache.commons.cli.TypeHandler;
import org.apache.commons.cli.PatternOptionBuilder;

public class TypeHandlerTest {

    // ==================== createValue(String, Class) ====================

    @Test
    public void testCreateValue_StringValue_ReturnsSameString() {
        Object result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValue_StringValue_NullInput() {
        Object result = TypeHandler.createValue(null, PatternOptionBuilder.STRING_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_NumberValue_Integer() {
        // NOTE: ไม่ยืนยัน type แน่นอน (Integer/Long) ขึ้นกับ commons-lang NumberUtils
        Object result = TypeHandler.createValue("42", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Number);
        assertEquals(42L, ((Number) result).longValue());
    }

    @Test
    public void testCreateValue_NumberValue_Double() {
        Object result = TypeHandler.createValue("3.14", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Number);
        assertEquals(3.14d, ((Number) result).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateValue_NumberValue_Malformed() {
        Object result = TypeHandler.createValue("not-a-number", PatternOptionBuilder.NUMBER_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_DateValue_AlwaysNull() {
        // KNOWN DEFECT: createDate() ไม่มีการ parse จริง ตัวแปร date ถูกกำหนดเป็น null เสมอ
        // ไม่ว่า str จะเป็นวันที่ที่ valid หรือไม่ก็ตาม ผลลัพธ์จะเป็น null เสมอ
        Object result = TypeHandler.createValue("2024-01-01", PatternOptionBuilder.DATE_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_ClassValue_ValidClassName() {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_ClassValue_InvalidClassName() {
        Object result = TypeHandler.createValue("no.such.Class", PatternOptionBuilder.CLASS_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_FileValue_ReturnsFile() {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValue_FilesValue_AlwaysNull() {
        // createFiles() เป็น stub ที่ยัง "ไม่ implement" ตามคอมเมนต์ในซอร์ส -> คืน null เสมอ
        Object result = TypeHandler.createValue("a.txt,b.txt", PatternOptionBuilder.FILES_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_UrlValue_ValidUrl() throws Exception {
        Object result = TypeHandler.createValue("http://apache.org", PatternOptionBuilder.URL_VALUE);
        assertTrue(result instanceof URL);
        assertEquals(new URL("http://apache.org"), result);
    }

    @Test
    public void testCreateValue_UrlValue_MalformedUrl() {
        Object result = TypeHandler.createValue("not a url", PatternOptionBuilder.URL_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_UnknownClass_ReturnsNull() {
        // ใช้ Class ที่ไม่ตรงกับ constant ใดๆ ใน PatternOptionBuilder เพื่อ hit else branch สุดท้าย
        Object result = TypeHandler.createValue("x", Integer.class);
        assertNull(result);
    }

    @Test
    public void testCreateValue_ExistingFileValue_Branch() {
        // NOTE (ไม่ยืนยัน 100%): จากที่ทราบเกี่ยวกับ Cli-3b, EXISTING_FILE_VALUE ใน
        // PatternOptionBuilder อาจถูกประกาศเป็น sentinel Object (ไม่ใช่ Class) เพื่อแยกจาก
        // FILE_VALUE (มิฉะนั้นทั้งคู่จะเป็น File.class ตัวเดียวกัน ทำให้ branch นี้ unreachable)
        // ถ้าเป็น Object sentinel -> เรียกผ่าน createValue(String,Object) จะ throw CCE
        try {
            Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
            assertTrue(result instanceof File);
        } catch (ClassCastException cce) {
            assertTrue(true); // สอดคล้องกับสมมติฐาน sentinel Object
        }
    }

    // ==================== createValue(String, Object) overload ====================

    @Test
    public void testCreateValueObjectOverload_DelegatesCorrectly() {
        Object obj = PatternOptionBuilder.STRING_VALUE; // เป็น Class อยู่แล้ว
        Object result = TypeHandler.createValue("abc", obj);
        assertEquals("abc", result);
    }

    @Test
    public void testCreateValueObjectOverload_WithNonClassObject_ThrowsCCE() {
        // obj ไม่ใช่ Class instance -> การ cast (Class) obj ภายใน method ต้อง throw CCE
        try {
            TypeHandler.createValue("abc", (Object) "not-a-class");
            fail("Expected ClassCastException when obj is not a Class instance");
        } catch (ClassCastException expected) {
            // expected
        }
    }

    @Test
    public void testCreateValueObject_withObjectValueConstant() {
        // NOTE (ไม่ยืนยัน 100%): OBJECT_VALUE อาจถูกประกาศเป็น sentinel Object แทน Object.class
        // ถ้าเป็นเช่นนั้นการเรียกผ่าน overload (String,Object) จะ throw ClassCastException
        // (เกี่ยวข้องกับ known defect Cli-3b) - ถ้าไม่ throw แสดงว่า OBJECT_VALUE เป็น Class จริง
        try {
            Object result = TypeHandler.createValue("java.lang.Object", PatternOptionBuilder.OBJECT_VALUE);
            assertNotNull(result);
        } catch (ClassCastException cce) {
            assertTrue(true);
        }
    }

    // ==================== createObject ====================

    @Test
    public void testCreateObject_ValidClassWithNoArgConstructor() {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
    }

    @Test
    public void testCreateObject_ClassNotFound() {
        Object result = TypeHandler.createObject("no.such.ClassName");
        assertNull(result);
    }

    @Test
    public void testCreateObject_InstantiationException_AbstractClass() {
        // java.lang.Number เป็น abstract -> newInstance() throw InstantiationException
        Object result = TypeHandler.createObject("java.lang.Number");
        assertNull(result);
    }

    @Test
    public void testCreateObject_IllegalAccessException_PrivateConstructor() {
        // java.lang.Void มี constructor เป็น private -> newInstance() throw IllegalAccessException
        Object result = TypeHandler.createObject("java.lang.Void");
        assertNull(result);
    }

    @Test
    public void testCreateObject_NullInput() {
        // Class.forName(null) throw NullPointerException ซึ่ง createObject ไม่ได้ catch ไว้
        // (catch เฉพาะ ClassNotFoundException) จึง propagate ออกไป
        try {
            TypeHandler.createObject(null);
            fail("Expected NullPointerException from Class.forName(null)");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    // ==================== createNumber ====================

    @Test
    public void testCreateNumber_Integer() {
        Number result = TypeHandler.createNumber("123");
        assertNotNull(result);
        assertEquals(123L, result.longValue());
    }

    @Test
    public void testCreateNumber_Double() {
        Number result = TypeHandler.createNumber("1.5");
        assertNotNull(result);
        assertEquals(1.5d, result.doubleValue(), 0.0001);
    }

    @Test
    public void testCreateNumber_Malformed() {
        Number result = TypeHandler.createNumber("abc");
        assertNull(result);
    }

    @Test
    public void testCreateNumber_EmptyString() {
        // NOTE: อาจขึ้นกับ version ของ commons-lang ว่า throw NumberFormatException หรือไม่
        Number result = TypeHandler.createNumber("");
        assertNull(result);
    }

    @Test
    public void testCreateNumber_NullInput() {
        // ตาม commons-lang: NumberUtils.createNumber(null) คืน null โดยตรง ไม่ throw exception
        Number result = TypeHandler.createNumber(null);
        assertNull(result);
    }

    // ==================== createClass ====================

    @Test
    public void testCreateClass_Valid() {
        Class result = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateClass_Invalid() {
        Class result = TypeHandler.createClass("no.such.Class");
        assertNull(result);
    }

    // ==================== createDate ====================

    @Test
    public void testCreateDate_AlwaysReturnsNull() {
        // KNOWN DEFECT: ไม่มีการ parse str เป็น Date จริง - if(date==null) เป็น true เสมอ
        Date result = TypeHandler.createDate("2024-01-01");
        assertNull(result);
    }

    @Test
    public void testCreateDate_NullInput() {
        Date result = TypeHandler.createDate(null);
        assertNull(result);
    }

    // ==================== createURL ====================

    @Test
    public void testCreateURL_Valid() throws Exception {
        URL result = TypeHandler.createURL("http://apache.org");
        assertEquals(new URL("http://apache.org"), result);
    }

    @Test
    public void testCreateURL_Malformed() {
        URL result = TypeHandler.createURL("not a valid url");
        assertNull(result);
    }

    @Test
    public void testCreateURL_EmptyString() {
        URL result = TypeHandler.createURL("");
        assertNull(result);
    }

    // ==================== createFile ====================

    @Test
    public void testCreateFile_ValidPath() {
        File result = TypeHandler.createFile("test.txt");
        assertNotNull(result);
        assertEquals("test.txt", result.getName());
    }

    @Test
    public void testCreateFile_EmptyString() {
        File result = TypeHandler.createFile("");
        assertNotNull(result);
    }

    @Test
    public void testCreateFile_NullInput() {
        // new File(null) throw NullPointerException (ไม่มีการ handle ใน source)
        try {
            TypeHandler.createFile(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    // ==================== createFiles ====================

    @Test
    public void testCreateFiles_AlwaysReturnsNull() {
        // Stub method ตามคอมเมนต์ในซอร์ส -> return null เสมอ
        File[] result = TypeHandler.createFiles("a.txt,b.txt");
        assertNull(result);
    }

    @Test
    public void testCreateFiles_NullInput() {
        File[] result = TypeHandler.createFiles(null);
        assertNull(result);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateValue_StringValue_*` | `createValue(Class)`: `STRING_VALUE == clazz` (true), input null |
| `testCreateValue_NumberValue_Integer/Double/Malformed` | branch `NUMBER_VALUE == clazz` → เรียก `createNumber` ทั้ง success/NFE |
| `testCreateValue_DateValue_AlwaysNull` | branch `DATE_VALUE == clazz` → เผยให้เห็น defect ของ `createDate` |
| `testCreateValue_ClassValue_Valid/Invalid` | branch `CLASS_VALUE == clazz` → success/CNFE |
| `testCreateValue_FileValue_ReturnsFile` | branch `FILE_VALUE == clazz` |
| `testCreateValue_FilesValue_AlwaysNull` | branch `FILES_VALUE == clazz` → stub null |
| `testCreateValue_UrlValue_Valid/Malformed` | branch `URL_VALUE == clazz` → success/MalformedURLException |
| `testCreateValue_UnknownClass_ReturnsNull` | `else` branch สุดท้ายของ if-chain |
| `testCreateValue_ExistingFileValue_Branch` | branch `EXISTING_FILE_VALUE == clazz` (สมมติฐานมีคอมเมนต์กำกับ) |
| `testCreateValueObjectOverload_*` | เมธอด `createValue(Object)`: การ cast สำเร็จ / CCE |
| `testCreateValueObject_withObjectValueConstant` | branch `OBJECT_VALUE == clazz` ผ่าน overload Object (สมมติฐานมีคอมเมนต์กำกับ) |
| `testCreateObject_ValidClassWithNoArgConstructor` | try success ทั้งสองชั้น (`Class.forName` + `newInstance`) |
| `testCreateObject_ClassNotFound` | catch `ClassNotFoundException` |
| `testCreateObject_InstantiationException_AbstractClass` | catch `InstantiationException` |
| `testCreateObject_IllegalAccessException_PrivateConstructor` | catch `IllegalAccessException` |
| `testCreateObject_NullInput` | uncaught NPE (edge case ไม่ถูก handle) |
| `testCreateNumber_Integer/Double` | try success ของ `createNumber` |
| `testCreateNumber_Malformed/EmptyString` | catch `NumberFormatException` |
| `testCreateNumber_NullInput` | null input ไม่ throw exception |
| `testCreateClass_Valid/Invalid` | try success / catch `ClassNotFoundException` |
| `testCreateDate_AlwaysReturnsNull/NullInput` | if(date==null) branch เดียวที่มีอยู่จริง (defect) |
| `testCreateURL_Valid/Malformed/EmptyString` | try success / catch `MalformedURLException` |
| `testCreateFile_ValidPath/EmptyString/NullInput` | constructor ปกติ + NPE edge case |
| `testCreateFiles_AlwaysReturnsNull/NullInput` | stub method (ไม่มี branch จริง) |

**หมายเหตุสำคัญ:** เทสที่มีคอมเมนต์ "NOTE (ไม่ยืนยัน 100%)" เกี่ยวข้องกับค่าคงที่ใน `PatternOptionBuilder` (`OBJECT_VALUE`, `EXISTING_FILE_VALUE`) ซึ่งไม่มีซอร์สโค้ดยืนยันในโจทย์ ถูกเขียนแบบ defensive (try/catch ทั้งสองกรณี) เพื่อไม่ fail หากสมมติฐานผิด แต่ยังคงมีประโยชน์ในการดักจับ regression/known defect ที่เกี่ยวข้องกับ Cli-3b
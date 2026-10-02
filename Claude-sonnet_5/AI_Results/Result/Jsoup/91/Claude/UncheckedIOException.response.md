# UncheckedIOExceptionTest.java

```java
package org.jsoup;

import org.junit.Test;
import org.junit.Before;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jsoup.UncheckedIOException
 * Target: Defects4J Jsoup-91b
 *
 * โครงสร้างคลาสเป้าหมายมีเพียง:
 *  - Constructor(IOException cause) -> super(cause)
 *  - ioException() -> return (IOException) getCause();
 *
 * เนื่องจากไม่มี if/else หรือ loop ที่ชัดแจ้งในซอร์สโค้ดนี้
 * การวิเคราะห์ branch coverage จึงอิงจากพฤติกรรมภายในของ
 * superclass (RuntimeException/Throwable) ที่มีเงื่อนไข
 * cause == null หรือไม่ (ส่งผลต่อ getMessage()), รวมถึง
 * edge case ของชนิด cause (IOException ธรรมดา vs subclass)
 */
public class UncheckedIOExceptionTest {

    private IOException sampleCause;

    @Before
    public void setUp() {
        sampleCause = new IOException("sample io error");
    }

    // ---------- 1. Normal case: cause ไม่เป็น null ----------
    @Test
    public void testConstructorStoresCauseCorrectly() {
        UncheckedIOException ex = new UncheckedIOException(sampleCause);
        assertSame("getCause() ควรคืน object เดียวกับที่ส่งเข้าไปใน constructor",
                sampleCause, ex.getCause());
    }

    @Test
    public void testIoExceptionReturnsSameReferenceAsGetCause() {
        UncheckedIOException ex = new UncheckedIOException(sampleCause);
        assertSame("ioException() ต้อง cast และคืนค่าเดียวกับ getCause()",
                ex.getCause(), ex.ioException());
    }

    @Test
    public void testIoExceptionIsInstanceOfIOException() {
        UncheckedIOException ex = new UncheckedIOException(sampleCause);
        assertTrue("ผลลัพธ์จาก ioException() ต้องเป็น instance ของ IOException",
                ex.ioException() instanceof IOException);
    }

    @Test
    public void testMessageMatchesCauseToStringWhenCauseNotNull() {
        UncheckedIOException ex = new UncheckedIOException(sampleCause);
        // RuntimeException(Throwable cause) -> message = cause.toString() เมื่อ cause != null
        assertEquals("message ควรเท่ากับ cause.toString() เมื่อ cause ไม่ null",
                sampleCause.toString(), ex.getMessage());
    }

    // ---------- 2. Boundary case: cause เป็น null ----------
    @Test
    public void testConstructorWithNullCause() {
        UncheckedIOException ex = new UncheckedIOException(null);
        assertNull("getCause() ควรเป็น null เมื่อสร้างด้วย null cause", ex.getCause());
    }

    @Test
    public void testIoExceptionReturnsNullWhenCauseIsNull() {
        UncheckedIOException ex = new UncheckedIOException(null);
        assertNull("ioException() ควร cast null -> null ได้โดยไม่ throw",
                ex.ioException());
    }

    @Test
    public void testMessageIsNullWhenCauseIsNull() {
        UncheckedIOException ex = new UncheckedIOException(null);
        // RuntimeException(Throwable cause) -> message = null เมื่อ cause == null
        assertNull("message ควรเป็น null เมื่อ cause เป็น null", ex.getMessage());
    }

    // ---------- 3. Edge case: IOException ที่มี message เป็นค่าว่าง ----------
    @Test
    public void testIoExceptionWithEmptyMessageCause() {
        IOException emptyMsgCause = new IOException("");
        UncheckedIOException ex = new UncheckedIOException(emptyMsgCause);
        assertEquals("message ควรตรงกับ cause.toString() แม้ message ของ cause เป็นค่าว่าง",
                emptyMsgCause.toString(), ex.getMessage());
        assertSame(emptyMsgCause, ex.ioException());
    }

    // ---------- 4. Edge case: IOException ที่ไม่มี message (no-arg constructor) ----------
    @Test
    public void testIoExceptionWithNoArgConstructorCause() {
        IOException noArgCause = new IOException();
        UncheckedIOException ex = new UncheckedIOException(noArgCause);
        assertSame(noArgCause, ex.ioException());
        assertEquals(noArgCause.toString(), ex.getMessage());
    }

    // ---------- 5. Subclass case: ส่ง subclass ของ IOException เข้าไป ----------
    @Test
    public void testIoExceptionWithSubclassCause() {
        FileNotFoundException fnfe = new FileNotFoundException("file missing");
        UncheckedIOException ex = new UncheckedIOException(fnfe);
        // cast (IOException) ควรทำงานได้ปกติเพราะ FileNotFoundException extends IOException
        assertSame("ควรคืน reference เดิมแม้เป็น subclass ของ IOException",
                fnfe, ex.ioException());
        assertTrue(ex.ioException() instanceof FileNotFoundException);
    }

    // ---------- 6. ตรวจสอบว่าเป็น RuntimeException (unchecked) จริง ----------
    @Test
    public void testIsInstanceOfRuntimeException() {
        UncheckedIOException ex = new UncheckedIOException(sampleCause);
        assertTrue("UncheckedIOException ต้องเป็น RuntimeException (unchecked)",
                ex instanceof RuntimeException);
    }

    // ---------- 7. ตรวจสอบการ throw/catch จริงว่าทำงานตามคาด ----------
    @Test
    public void testThrowAndCatchPropagatesCauseCorrectly() {
        try {
            throw new UncheckedIOException(sampleCause);
        } catch (UncheckedIOException caught) {
            assertSame(sampleCause, caught.ioException());
            assertSame(sampleCause, caught.getCause());
        } catch (Exception other) {
            fail("ควรถูก catch เป็น UncheckedIOException เท่านั้น ไม่ใช่ " + other.getClass());
        }
    }

    // ---------- 8. ตรวจสอบว่า getCause() ของ UncheckedIOException สองตัวที่ wrap คนละ cause ไม่ชนกัน ----------
    @Test
    public void testTwoInstancesWithDifferentCausesAreIndependent() {
        IOException cause1 = new IOException("error1");
        IOException cause2 = new IOException("error2");

        UncheckedIOException ex1 = new UncheckedIOException(cause1);
        UncheckedIOException ex2 = new UncheckedIOException(cause2);

        assertNotSame(ex1.ioException(), ex2.ioException());
        assertSame(cause1, ex1.ioException());
        assertSame(cause2, ex2.ioException());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorStoresCauseCorrectly` | Constructor เก็บ cause ปกติ (cause != null) |
| `testIoExceptionReturnsSameReferenceAsGetCause` | `ioException()` cast และคืนค่าตรงกับ `getCause()` (cause != null) |
| `testIoExceptionIsInstanceOfIOException` | ตรวจสอบ type ของผลลัพธ์จาก cast ใน `ioException()` |
| `testMessageMatchesCauseToStringWhenCauseNotNull` | Branch ภายใน super(cause): cause != null → message = cause.toString() |
| `testConstructorWithNullCause` | Boundary: cause == null, getCause() คืน null |
| `testIoExceptionReturnsNullWhenCauseIsNull` | `ioException()` กับ cause == null (cast null-safe) |
| `testMessageIsNullWhenCauseIsNull` | Branch ภายใน super(cause): cause == null → message = null |
| `testIoExceptionWithEmptyMessageCause` | Edge case: cause มี message เป็นค่าว่าง ("") |
| `testIoExceptionWithNoArgConstructorCause` | Edge case: cause สร้างจาก no-arg constructor (message = null) |
| `testIoExceptionWithSubclassCause` | Edge case: cause เป็น subclass ของ IOException (FileNotFoundException) — ตรวจ cast ยังทำงานถูกต้อง |
| `testIsInstanceOfRuntimeException` | ตรวจสอบ inheritance ว่าเป็น unchecked exception |
| `testThrowAndCatchPropagatesCauseCorrectly` | พฤติกรรมจริงเมื่อ throw/catch exception และเข้าถึง cause ผ่าน method ทั้งสอง |
| `testTwoInstancesWithDifferentCausesAreIndependent` | ตรวจสอบว่าหลาย instance ไม่แชร์ state ของ cause กัน (regression/fault detection) |

**หมายเหตุ:** คลาสเป้าหมายไม่มี if/else หรือ loop ที่ชัดแจ้งในระดับ source code ของตัวเอง ดังนั้น branch ที่ตรวจสอบจริงส่วนใหญ่มาจากพฤติกรรมภายใน `RuntimeException(Throwable)`/`Throwable(Throwable)` (เงื่อนไข cause == null หรือไม่) และจากการ cast type ใน `ioException()` ซึ่งเป็นจุดที่อาจเกิด `ClassCastException` ได้หากมีการเปลี่ยนแปลงพฤติกรรมในอนาคต
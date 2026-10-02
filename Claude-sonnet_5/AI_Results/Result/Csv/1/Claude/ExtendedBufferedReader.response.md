# วิเคราะห์โครงสร้างและ Branch ของคลาส

คลาส `ExtendedBufferedReader` เป็น package-private (ไม่มี `public`) ดังนั้นคลาสทดสอบต้องอยู่ใน package เดียวกัน (`org.apache.commons.csv`) จึงจะเข้าถึงได้ — ไม่จำเป็นต้องมี `import` explicit เพราะเป็น package เดียวกัน (คอมเมนต์กำกับไว้ในโค้ด)

จุดที่ต้องครอบคลุม (branch/condition) มีดังนี้:
- `read()`: `current=='\n'` true/false, EOF
- `read(char[],int,int)`: `length==0`, `len>0` / `len==-1`, ภายใน loop: `ch=='\n'`(กับ i==0 เทียบ lastChar, i>0 เทียบ buf[i-1], ผลลัพธ์ true/false), `ch=='\r'`
- `readLine()`: `line!=null` true/false, `line.length()>0` true/false
- `lookAhead()`: กรณีปกติ / EOF
- `getLineNumber()` : ค่าเริ่มต้นและหลังการอ่านหลายบรรทัด

```java
package org.apache.commons.csv; 
// หมายเหตุ: ต้องอยู่ package เดียวกับคลาสเป้าหมายเพราะ ExtendedBufferedReader เป็น package-private
// ไม่ต้อง import class เป้าหมายเนื่องจากอยู่ package เดียวกัน

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class ExtendedBufferedReaderTest {

    // ---------------------- read() ----------------------

    @Test
    public void testRead_NormalCharacter_NoLineIncrement() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("A"));
        int c = r.read();
        assertEquals('A', c);
        assertEquals('A', r.readAgain());
        assertEquals(0, r.getLineNumber());
    }

    @Test
    public void testRead_NewlineCharacter_IncrementsLineCounter() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("\n"));
        int c = r.read();
        assertEquals('\n', c);
        assertEquals('\n', r.readAgain());
        assertEquals(1, r.getLineNumber());
    }

    @Test
    public void testRead_EndOfStream() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        int c = r.read();
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, c);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
        assertEquals(0, r.getLineNumber());
    }

    // ---------------------- readAgain() ----------------------

    @Test
    public void testReadAgain_InitiallyUndefined() {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ABC"));
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
    }

    // ---------------------- read(char[], int, int) ----------------------

    @Test
    public void testReadBuf_ZeroLength_ReturnsZero_NoStateChange() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ABC"));
        char[] buf = new char[3];
        int len = r.read(buf, 0, 0);
        assertEquals(0, len);
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
        assertEquals(0, r.getLineNumber());
    }

    @Test
    public void testReadBuf_EOF_ReturnsMinusOne_SetsEndOfStream() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        char[] buf = new char[5];
        int len = r.read(buf, 0, 5);
        assertEquals(-1, len);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    @Test
    public void testReadBuf_NormalNoNewlineOrCR() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ABC"));
        char[] buf = new char[3];
        int len = r.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals('C', r.readAgain());
        assertEquals(0, r.getLineNumber());
    }

    @Test
    public void testReadBuf_CRCharacter_IncrementsLineCounter() throws IOException {
        // '\r' ไม่มี '\n' ตามหลัง -> ใช้ branch else-if (ch == '\r')
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("A\rB"));
        char[] buf = new char[3];
        int len = r.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals(1, r.getLineNumber());
        assertEquals('B', r.readAgain());
    }

    @Test
    public void testReadBuf_NewlineAtIndexZero_PriorLastCharIsCR_NoIncrement() throws IOException {
        // จำลอง lastChar == '\r' จากการอ่านก่อนหน้า แล้วให้ '\n' อยู่ที่ index 0 ของ buffer ถัดไป
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("\r\nXY"));
        int first = r.read(); // อ่าน '\r' -> lastChar = '\r'
        assertEquals('\r', first);
        assertEquals(0, r.getLineNumber());

        char[] buf = new char[3];
        int len = r.read(buf, 0, 3); // อ่าน "\nXY"
        assertEquals(3, len);
        // i==0 -> เทียบกับ lastChar('\r') -> เท่ากัน -> ไม่เพิ่ม lineCounter
        assertEquals(0, r.getLineNumber());
        assertEquals('Y', r.readAgain());
    }

    @Test
    public void testReadBuf_NewlineAtIndexZero_PriorLastCharNotCR_Increment() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("X\nYZ"));
        int first = r.read(); // อ่าน 'X' -> lastChar = 'X'
        assertEquals('X', first);
        assertEquals(0, r.getLineNumber());

        char[] buf = new char[3];
        int len = r.read(buf, 0, 3); // อ่าน "\nYZ"
        assertEquals(3, len);
        // i==0 -> เทียบกับ lastChar('X') != '\r' -> เพิ่ม lineCounter
        assertEquals(1, r.getLineNumber());
        assertEquals('Z', r.readAgain());
    }

    @Test
    public void testReadBuf_NewlineAfterCRWithinBuffer_NoDoubleIncrement() throws IOException {
        // "A\r\nB" อ่านในครั้งเดียว: i>0 -> buf[i-1]=='\r' -> ไม่เพิ่มซ้ำสำหรับ '\n'
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("A\r\nB"));
        char[] buf = new char[4];
        int len = r.read(buf, 0, 4);
        assertEquals(4, len);
        // '\r' ที่ i=1 -> lineCounter=1 ; '\n' ที่ i=2 buf[1]=='\r' -> ไม่เพิ่ม (คงที่ 1)
        assertEquals(1, r.getLineNumber());
        assertEquals('B', r.readAgain());
    }

    @Test
    public void testReadBuf_NewlineAfterNonCRWithinBuffer_Increment() throws IOException {
        // "AB\nC" : i>0 -> buf[i-1]='B' != '\r' -> เพิ่ม lineCounter
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("AB\nC"));
        char[] buf = new char[4];
        int len = r.read(buf, 0, 4);
        assertEquals(4, len);
        assertEquals(1, r.getLineNumber());
        assertEquals('C', r.readAgain());
    }

    @Test
    public void testReadBuf_WithOffset() throws IOException {
        // ทดสอบการจัดการ index เมื่อ offset != 0
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("XY\nZ"));
        char[] buf = new char[6];
        int len = r.read(buf, 2, 4);
        assertEquals(4, len);
        assertEquals('X', buf[2]);
        assertEquals('Y', buf[3]);
        assertEquals('\n', buf[4]);
        assertEquals('Z', buf[5]);
        assertEquals(1, r.getLineNumber());
        assertEquals('Z', r.readAgain());
    }

    // ---------------------- readLine() ----------------------

    @Test
    public void testReadLine_NormalLine_SetsLastCharAndIncrementsCounter() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("Hello\nWorld"));
        String line = r.readLine();
        assertEquals("Hello", line);
        assertEquals('o', r.readAgain());
        assertEquals(1, r.getLineNumber());
    }

    @Test
    public void testReadLine_EmptyLine_DoesNotUpdateLastChar_ButIncrementsCounter() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("\nSecond"));
        String line = r.readLine();
        assertEquals("", line);
        // line.length()==0 -> ไม่ตั้งค่า lastChar (ยังเป็น UNDEFINED)
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
        assertEquals(1, r.getLineNumber());
    }

    @Test
    public void testReadLine_EOF_SetsEndOfStream() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        String line = r.readLine();
        assertNull(line);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
        assertEquals(0, r.getLineNumber());
    }

    // ---------------------- lookAhead() ----------------------

    @Test
    public void testLookAhead_DoesNotConsumeCharacter() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("AB"));
        int peeked = r.lookAhead();
        assertEquals('A', peeked);
        // lookAhead ใช้ super.read() ตรง ๆ จึงไม่กระทบ lastChar/lineCounter ของคลาสนี้
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
        int actual = r.read();
        assertEquals('A', actual);
        assertEquals('A', r.readAgain());
    }

    @Test
    public void testLookAhead_AtEndOfStream() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        int peeked = r.lookAhead();
        assertEquals(-1, peeked);
    }

    // ---------------------- getLineNumber() ----------------------

    @Test
    public void testGetLineNumber_InitiallyZero() {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("test"));
        assertEquals(0, r.getLineNumber());
    }

    @Test
    public void testGetLineNumber_AfterMultipleNewlinesViaRead() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("A\nB\nC"));
        int c;
        while ((c = r.read()) != ExtendedBufferedReader.END_OF_STREAM) {
            // อ่านจนหมด
        }
        assertEquals(2, r.getLineNumber());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testRead_NormalCharacter_NoLineIncrement` | `read()`: `current=='\n'` → false |
| `testRead_NewlineCharacter_IncrementsLineCounter` | `read()`: `current=='\n'` → true |
| `testRead_EndOfStream` | `read()`: EOF, `current==-1` (not `\n`), lastChar=-1 |
| `testReadAgain_InitiallyUndefined` | `readAgain()` ก่อนอ่านใด ๆ (state เริ่มต้น) |
| `testReadBuf_ZeroLength_ReturnsZero_NoStateChange` | `read(buf,offset,length)`: `length==0` → true (early return) |
| `testReadBuf_EOF_ReturnsMinusOne_SetsEndOfStream` | `read(buf,...)`: `len==-1` branch |
| `testReadBuf_NormalNoNewlineOrCR` | `read(buf,...)`: `len>0`, loop ไม่พบ `\n`/`\r` |
| `testReadBuf_CRCharacter_IncrementsLineCounter` | loop: `ch=='\r'` (else-if) → true |
| `testReadBuf_NewlineAtIndexZero_PriorLastCharIsCR_NoIncrement` | loop: `ch=='\n'`, `i==0` (ใช้ lastChar), เทียบ `'\r'!=lastChar` → false |
| `testReadBuf_NewlineAtIndexZero_PriorLastCharNotCR_Increment` | loop: `ch=='\n'`, `i==0`, เทียบ `'\r'!=lastChar` → true |
| `testReadBuf_NewlineAfterCRWithinBuffer_NoDoubleIncrement` | loop: `ch=='\n'`, `i>0` (ใช้ buf[i-1]), `'\r'!=buf[i-1]` → false |
| `testReadBuf_NewlineAfterNonCRWithinBuffer_Increment` | loop: `ch=='\n'`, `i>0`, `'\r'!=buf[i-1]` → true |
| `testReadBuf_WithOffset` | ตรวจ index/offset ที่ถูกต้องใน loop และ `lastChar` ตำแหน่งท้าย |
| `testReadLine_NormalLine_SetsLastCharAndIncrementsCounter` | `readLine()`: `line!=null` true, `line.length()>0` true |
| `testReadLine_EmptyLine_DoesNotUpdateLastChar_ButIncrementsCounter` | `readLine()`: `line!=null` true, `line.length()>0` false |
| `testReadLine_EOF_SetsEndOfStream` | `readLine()`: `line!=null` false (EOF) |
| `testLookAhead_DoesNotConsumeCharacter` | `lookAhead()` กรณีปกติ (mark/read/reset ไม่กระทบ state) |
| `testLookAhead_AtEndOfStream` | `lookAhead()` กรณี EOF (`-1`) |
| `testGetLineNumber_InitiallyZero` | ค่าเริ่มต้น `lineCounter==0` |
| `testGetLineNumber_AfterMultipleNewlinesViaRead` | ผลสะสมของ `lineCounter` จากหลายการเรียก `read()` |

**หมายเหตุ:** สมมติฐานเรื่อง buffering ของ `StringReader`-backed `BufferedReader` ที่ `super.read(char[],int,int)` จะคืนค่าครบตามที่ขอในครั้งเดียวเมื่อข้อมูลต้นทางมีขนาดเล็กกว่า internal buffer (ค่า default 8192) — เป็น behavior ปกติของ JDK implementation แต่ไม่ได้ระบุไว้ตรง ๆ ใน source ที่ให้มา จึงกำกับไว้เป็นคอมเมนต์ในเทสที่เกี่ยวข้อง
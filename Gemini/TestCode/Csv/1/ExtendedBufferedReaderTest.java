package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class ExtendedBufferedReaderTest {

    @Test
    public void testInitialState() {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("a"));
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testReadNormalAndNewLine() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("a\nb"));
        
        // อ่าน 'a'
        assertEquals('a', reader.read());
        assertEquals('a', reader.readAgain());
        assertEquals(0, reader.getLineNumber());

        // อ่าน '\n' (ควรเพิ่ม lineCounter)
        assertEquals('\n', reader.read());
        assertEquals('\n', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        // อ่าน 'b'
        assertEquals('b', reader.read());
        assertEquals('b', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        // อ่าน EOF
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadArrayZeroLength() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[3];
        
        // ทดสอบ length == 0 branch
        int len = reader.read(buf, 0, 0);
        assertEquals(0, len);
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
    }

    @Test
    public void testReadArrayWithCarriageReturnAndNewLine() throws IOException {
        // ทดสอบการนับบรรทัดของ \r\n และ \r เดี่ยวๆ รวมถึงกรณีคาบเกี่ยวระหว่างบัฟเฟอร์กับ lastChar
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("a\r\nb\rc\n"));
        char[] buf = new char[10];
        
        int len = reader.read(buf, 0, 10);
        assertEquals(7, len);
        // สตริงคือ "a\r\nb\rc\n" -> 
        // '\r' -> lineCounter++ (1)
        // '\n' (ตัวก่อนหน้าคือ '\r') -> lineCounter ไม่บวกเพิ่ม (ยังคง 1)
        // '\r' -> lineCounter++ (2)
        // '\n' (ตัวก่อนหน้าไม่ใช่ '\r' แต่คือ 'c') -> lineCounter++ (3)
        assertEquals(3, reader.getLineNumber());
        assertEquals('\n', reader.readAgain());
    }

    @Test
    public void testReadArrayEof() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));
        char[] buf = new char[5];
        
        int len = reader.read(buf, 0, 5);
        assertEquals(-1, len);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadLineNormalAndEmpty() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("line1\n\nline3"));
        
        // บรรทัดที่ 1: "line1"
        assertEquals("line1", reader.readLine());
        assertEquals('1', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        // บรรทัดที่ 2: บรรทัดว่าง "" (length == 0 branch)
        assertEquals("", reader.readLine());
        // ตรวจสอบว่า lastChar ไม่ถูกเปลี่ยนเมื่อเจอ empty line (ยังคงเป็น '1')
        assertEquals('1', reader.readAgain());
        assertEquals(2, reader.getLineNumber());

        // บรรทัดที่ 3: "line3"
        assertEquals("line3", reader.readLine());
        assertEquals('3', reader.readAgain());
        assertEquals(3, reader.getLineNumber());

        // อ่านเจอ EOF ผ่าน readLine()
        assertNull(reader.readLine());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testLookAhead() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("xyz"));
        
        // lookAhead ต้องคืนค่าตัวอักษรตัวแรกโดยไม่ขยับ pointer
        assertEquals('x', reader.lookAhead());
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());

        // อ่านจริงต้องได้ 'x' เหมือนเดิม
        assertEquals('x', reader.read());
        assertEquals('x', reader.readAgain());

        // lookAhead ตัวถัดไป
        assertEquals('y', reader.lookAhead());
        assertEquals('y', reader.read());
    }
}
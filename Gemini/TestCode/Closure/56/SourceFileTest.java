package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SourceFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFileName() {
        new SourceFile(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyFileName() {
        new SourceFile("");
    }

    @Test
    public void testBasicPreloadedProperties() {
        SourceFile file = SourceFile.fromCode("test.js", "orig.js", "var a = 1;");
        assertEquals("test.js", file.getName());
        assertEquals("orig.js", file.getOriginalPath());
        assertFalse(file.isExtern());
        file.setIsExtern(true);
        assertTrue(file.isExtern());
        assertEquals("test.js", file.toString());
        assertTrue(file.hasSourceInMemory());
    }

    @Test
    public void testDefaultOriginalPath() {
        SourceFile file = SourceFile.fromCode("test.js", "var a = 1;");
        assertEquals("test.js", file.getOriginalPath());
    }

    @Test
    public void testLineOffsetsAndNumLines() throws IOException {
        String code = "line1\nline2\nline3";
        SourceFile file = SourceFile.fromCode("multiline.js", code);
        
        assertEquals(3, file.getNumLines());
        assertEquals(0, file.getLineOffset(1));
        assertEquals(6, file.getLineOffset(2));
        assertEquals(12, file.getLineOffset(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffsetOutOfBoundsLow() throws IOException {
        SourceFile file = SourceFile.fromCode("test.js", "line1\nline2");
        file.getLineOffset(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffsetOutOfBoundsHigh() throws IOException {
        SourceFile file = SourceFile.fromCode("test.js", "line1\nline2");
        file.getLineOffset(5);
    }

    @Test
    public void testFindLineOffsetsIOExceptionFallback() {
        // สร้าง Generator ที่ขว้าง IOException ผ่านทาง getCode() เพื่อทดสอบ catch block ใน findLineOffsets
        SourceFile file = SourceFile.fromGenerator("error.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                throw new RuntimeException(new IOException("Simulated IO Error"));
            }
        });
        
        // ควรตกลงไปที่ catch (IOException e) และกำหนด lineOffsets = new int[1] {0}
        // เนื่องจาก getNumLines() เรียก findLineOffsets() ภายใน
        try {
            file.getNumLines();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    @Test
    public void testGetLineCachingAndEdgeCases() throws IOException {
        // ทดสอบทั้งแบบมีและไม่มี \n ปิดท้ายบรรทัดสุดท้าย
        String codeNoNewline = "line1\nline2\nline3";
        SourceFile file1 = SourceFile.fromCode("f1.js", codeNoNewline);
        
        assertEquals("line1", file1.getLine(1));
        assertEquals("line2", file1.getLine(2));
        // เมื่อ lineIdx >= lastLine จะใช้ optimization ลูปจาก lastOffset/lastLine
        assertEquals("line3", file1.getLine(3));
        assertNull(file1.getLine(4)); // เกินขอบเขตหา \n ไม่เจอ คืนค่า null

        String codeWithNewline = "line1\nline2\n";
        SourceFile file2 = SourceFile.fromCode("f2.js", codeWithNewline);
        assertEquals("line1", file2.getLine(1));
        assertEquals("line2", file2.getLine(2));
        assertNull(file2.getLine(3)); // pos ชี้ถึง EOF
    }

    @Test
    public void testGetLineWithBackwardSearchOrUncached() throws IOException {
        SourceFile file = SourceFile.fromCode("f.js", "line1\nline2\nline3");
        // เรียกบรรทัดที่ 3 ก่อน เพื่อตั้งค่า lastLine = 3, lastOffset
        assertEquals("line3", file.getLine(3));
        // เรียกบรรทัดที่ 1 (lineNumber < lastLine) ทำให้ข้ามเงื่อนไข lineNumber >= lastLine
        assertEquals("line1", file.getLine(1));
    }

    @Test
    public void testGetLineIOExceptionHandling() {
        SourceFile file = SourceFile.fromGenerator("ioerr.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                // ขว้าง IOException ทางอ้อมหรือจำลองพฤติกรรมผ่าน subclass
                throw new RuntimeException(new IOException("IO fail"));
            }
        });
        assertNull(file.getLine(1));
    }

    @Test
    public void testGetRegionEdgeCases() throws IOException {
        // ทดสอบ getRegion ในสถานการณ์ต่างๆ (ความยาว region = 5)
        // ไฟล์สั้น, ไฟล์ยาว, มี \n ปิดท้าย และไม่มี \n ปิดท้าย
        String code = "l1\nl2\nl3\nl4\nl5\nl6\nl7";
        SourceFile file = SourceFile.fromCode("region.js", code);

        Region r1 = file.getRegion(1);
        assertNotNull(r1);
        assertEquals(1, r1.getBeginningLineNumber());

        // ทดสอบกรณีไม่มี \n ปิดท้ายตัวสุดท้าย (end == -1 และ js.charAt(last) != '\n')
        SourceFile fileNoNewlineEnd = SourceFile.fromCode("nonl.js", "a\nb\nc");
        Region r2 = fileNoNewlineEnd.getRegion(2);
        assertNotNull(r2);

        // ทดสอบกรณีมี \n ปิดท้ายตัวสุดท้าย (js.charAt(last) == '\n')
        SourceFile fileNewlineEnd = SourceFile.fromCode("nl.js", "a\nb\nc\n");
        Region r3 = fileNewlineEnd.getRegion(2);
        assertNotNull(r3);

        // ทดสอบ lineNumber >= endLine
        assertNull(file.getRegion(100));

        // ทดสอบ IOException ใน getRegion
        SourceFile ioErrFile = SourceFile.fromGenerator("err.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                throw new RuntimeException(new IOException("fail"));
            }
        });
        assertNull(ioErrFile.getRegion(1));
    }

    @Test
    public void testGeneratedSourceFile() throws IOException {
        SourceFile.Generator gen = new SourceFile.Generator() {
            @Override
            public String getCode() {
                return "generated code";
            }
        };
        SourceFile file = SourceFile.fromGenerator("gen.js", gen);
        assertEquals("generated code", file.getCode());
        // เรียกซ้ำเพื่อทดสอบ caching branch (cachedCode != null)
        assertEquals("generated code", file.getCode());

        file.clearCachedSource();
        assertFalse(file.hasSourceInMemory());
        assertEquals("generated code", file.getCode()); // โหลดใหม่จาก generator
    }

    @Test
    public void testOnDiskSourceFile() throws IOException {
        File tempFile = tempFolder.newFile("disk.js");
        java.nio.file.Files.write(tempFile.toPath(), "disk content".getBytes(StandardCharsets.UTF_8));

        SourceFile file = SourceFile.fromFile(tempFile, StandardCharsets.UTF_8);
        assertEquals("disk.js", file.getOriginalPath());
        assertEquals(StandardCharsets.UTF_8, ((SourceFile.OnDisk) file).getCharset());
        
        // ทดสอบอ่านจากดิสก์ (ยังไม่มีในหน่วยความจำ)
        assertFalse(file.hasSourceInMemory());
        assertNotNull(file.getCodeReader()); // ทดสอบ getCodeReader เมื่อยังไม่อยู่ในหน่วยความจำ

        assertEquals("disk content", file.getCode());
        assertTrue(file.hasSourceInMemory());
        
        // ทดสอบ getCodeReader เมื่ออยู่ในหน่วยความจำแล้ว
        assertNotNull(file.getCodeReader());

        file.clearCachedSource();
        assertFalse(file.hasSourceInMemory());

        // ทดสอบ constructor แบบไม่ระบุ charset
        SourceFile fileNoCharset = SourceFile.fromFile(tempFile);
        assertNotNull(fileNoCharset.getCode());
    }

    @Test
    public void testFromInputStreamAndReader() throws IOException {
        String content = "stream content";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        SourceFile streamFile = SourceFile.fromInputStream("stream.js", bais);
        assertEquals("stream content", streamFile.getCode());

        ByteArrayInputStream baisOriginal = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        SourceFile streamOrigFile = SourceFile.fromInputStream("stream.js", "orig_stream.js", baisOriginal);
        assertEquals("orig_stream.js", streamOrigFile.getOriginalPath());
        assertEquals("stream content", streamOrigFile.getCode());

        StringReader reader = new StringReader("reader content");
        SourceFile readerFile = SourceFile.fromReader("reader.js", reader);
        assertEquals("reader content", readerFile.getCode());
        
        // ทดสอบ fromFile แบบรับ String path และ Charset
        File tempFile = tempFolder.newFile("path.js");
        java.nio.file.Files.write(tempFile.toPath(), "path content".getBytes(StandardCharsets.UTF_8));
        SourceFile pathFile1 = SourceFile.fromFile(tempFile.getAbsolutePath(), StandardCharsets.UTF_8);
        assertEquals("path content", pathFile1.getCode());

        SourceFile pathFile2 = SourceFile.fromFile(tempFile.getAbsolutePath());
        assertEquals("path content", pathFile2.getCode());
    }
}
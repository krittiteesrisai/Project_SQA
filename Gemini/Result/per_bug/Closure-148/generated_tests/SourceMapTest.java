package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SourceMapTest {

    private SourceMap sourceMap;

    @Before
    public void setUp() {
        sourceMap = new SourceMap();
    }

    @Test
    public void testAddMappingWithNullSourceFile() {
        // Edge Case: Node ไม่มี source file พร็อพเพอร์ตี้
        Node node = new Node(Token.SCRIPT);
        node.setLineno(1);
        node.setCharno(0);
        
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
        
        // ควรถูก Ignore ไม่เพิ่ม mapping ลงไป
        StringBuilder sb = new StringBuilder();
        try {
            sourceMap.appendTo(sb, "test.js");
            fail("Expected IllegalStateException because mappings is empty");
        } catch (IllegalStateException e) {
            // Expected: Preconditions.checkState(!mappings.isEmpty()) ใน LineMapper
        } catch (IOException e) {
            fail("IOException not expected");
        }
    }

    @Test
    public void testAddMappingWithNegativeLineNumber() {
        // Edge Case: Line number ติดลบ (< 0)
        Node node = new Node(Token.SCRIPT);
        node.putProp(Node.SOURCEFILE_PROP, "file1.js");
        node.setLineno(-1);
        node.setCharno(0);

        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

        StringBuilder sb = new StringBuilder();
        try {
            sourceMap.appendTo(sb, "test.js");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        } catch (IOException e) {
            fail("IOException not expected");
        }
    }

    @Test
    public void testMappingWithOriginalNameAndMultipleFilesAndLineOffsets() throws IOException {
        // Boundary & Comprehensive Test: ทดสอบครบทั้ง originalName, การสลับไฟล์ (lastSourceFile != sourceFile),
        // และ line number > 0 สำหรับ start/end position
        SourceMap.Mapping mappingObj = new SourceMap.Mapping();
        mappingObj.id = 0;

        Node node1 = new Node(Token.NAME);
        node1.putProp(Node.SOURCEFILE_PROP, "fileA.js");
        node1.putProp(Node.ORIGINALNAME_PROP, "myVar");
        node1.setLineno(1);
        node1.setCharno(5);

        sourceMap.setStartingPosition(1, 2);
        sourceMap.setWrapperPrefix("prefix\nline2");

        // เพิ่ม mapping แรก (start/end line > 0)
        sourceMap.addMapping(node1, new Position(1, 0), new Position(1, 10));

        // เพิ่ม mapping ที่สอง (เปลี่ยน sourceFile เพื่อเทส cache escape string และไม่มี originalName)
        Node node2 = new Node(Token.NAME);
        node2.putProp(Node.SOURCEFILE_PROP, "fileB.js");
        node2.setLineno(2);
        node2.setCharno(1);
        sourceMap.addMapping(node2, new Position(0, 5), new Position(0, 15));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");
        
        assertTrue(sb.length() > 0);
        assertTrue(sb.toString().contains("fileA.js"));
        assertTrue(sb.toString().contains("fileB.js"));
        assertTrue(sb.toString().contains("myVar"));
    }

    @Test
    public void testMappingOverlapAndStackOperations() throws IOException {
        // Trigger overlapping logic: isOverlapped() และ Stack handling ใน LineMapper
        Node node1 = new Node(Token.BLOCK);
        node1.putProp(Node.SOURCEFILE_PROP, "script.js");
        node1.setLineno(1);
        node1.setCharno(0);

        Node node2 = new Node(Token.NAME);
        node2.putProp(Node.SOURCEFILE_PROP, "script.js");
        node2.setLineno(1);
        node2.setCharno(2);

        // Mapping 1 ครอบคลุมช่วงกว้าง
        sourceMap.addMapping(node1, new Position(0, 0), new Position(2, 0));
        // Mapping 2 ซ้อนอยู่ข้างใน
        sourceMap.addMapping(node2, new Position(0, 2), new Position(1, 5));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "out.js");
        assertNotNull(sb.toString());
    }

    @Test
    public void testSetWrapperPrefixWithMultipleNewlines() throws IOException {
        // ทดสอบการคำนวณ prefixLine และ prefixIndex จากอักขระขึ้นบรรทัดใหม่ '\n'
        sourceMap.setWrapperPrefix("line1\nline2\nline3");

        Node node = new Node(Token.STRING);
        node.putProp(Node.SOURCEFILE_PROP, "code.js");
        node.setLineno(1);
        node.setCharno(0);

        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "wrapped.js");
        assertTrue(sb.toString().contains("wrapped.js"));
    }
}
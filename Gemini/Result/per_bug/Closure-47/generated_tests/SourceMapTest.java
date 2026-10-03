package com.google.javascript.jscomp;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SourceMapTest {

    private SourceMap sourceMap;

    @Before
    public void setUp() {
        // ใช้ Format V3 เป็นค่าเริ่มต้นในการทดสอบ
        sourceMap = SourceMap.Format.V3.getInstance();
    }

    @Test
    public void testFormats() {
        assertNotNull(SourceMap.Format.V1.getInstance());
        assertNotNull(SourceMap.Format.DEFAULT.getInstance());
        assertNotNull(SourceMap.Format.V2.getInstance());
        assertNotNull(SourceMap.Format.V3.getInstance());
    }

    @Test
    public void testDetailLevelAll() {
        SourceMap.DetailLevel level = SourceMap.DetailLevel.ALL;
        Node dummyNode = new Node(Token.NUMBER);
        assertTrue("ALL detail level should always return true", level.apply(dummyNode));
    }

    @Test
    public void testDetailLevelSymbols() {
        SourceMap.DetailLevel level = SourceMap.DetailLevel.SYMBOLS;

        // 1. node.isCall()
        Node callNode = new Node(Token.CALL);
        assertTrue(level.apply(callNode));

        // 2. node.isNew()
        Node newNode = new Node(Token.NEW);
        assertTrue(level.apply(newNode));

        // 3. node.isFunction()
        Node funcNode = new Node(Token.FUNCTION);
        assertTrue(level.apply(funcNode));

        // 4. node.isName()
        Node nameNode = new Node(Token.NAME);
        assertTrue(level.apply(nameNode));

        // 5. NodeUtil.isGet (e.g., GETPROP)
        Node getPropNode = new Node(Token.GETPROP);
        assertTrue(level.apply(getPropNode));

        // 6. ObjectLitKey
        Node stringKey = Node.newString(Token.STRING_KEY, "key");
        Node objLit = new Node(Token.OBJECTLIT, stringKey);
        assertTrue(level.apply(stringKey));

        // 7. String node where parent is Get
        Node parentGet = new Node(Token.GETPROP);
        Node stringNode = Node.newString("prop");
        parentGet.addChildToBack(stringNode);
        assertTrue(level.apply(stringNode));

        // 8. Unmatched node (should return false)
        Node numberNode = new Node(Token.NUMBER);
        assertFalse(level.apply(numberNode));
    }

    @Test
    public void testAddMappingNullSourceFile() {
        // Edge Case: sourceFile == null -> should return early without exception
        Node node = new Node(Token.NAME);
        node.setLineno(1);
        node.setCharno(0);
        // node.getSourceFileName() will return null by default
        
        // Should not throw any exception
        sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 5));
    }

    @Test
    public void testAddMappingNegativeLineNumber() {
        // Edge Case: node.getLineno() < 0 -> should return early without exception
        Node node = new Node(Token.NAME, "test.js", 10, 5);
        node.setLineno(-1); // บังคับให้ติดลบ
        
        // Should not throw any exception
        sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 5));
    }

    @Test
    public void testAddMappingValid() {
        // Normal case with valid source file and line number
        Node node = new Node(Token.NAME, "test.js", 1, 0);
        node.putProp(Node.ORIGINALNAME_PROP, "originalName");

        // Should execute successfully
        sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 5));
    }

    @Test
    public void testPrefixMappingsAndCache() {
        // กำหนด Prefix Mapping
        List<SourceMap.LocationMapping> mappings = Arrays.asList(
            new SourceMap.LocationMapping("/original/path/", "/new/path/")
        );
        sourceMap.setPrefixMappings(mappings);

        // 1. เคสที่ตรงกับ Prefix Mapping
        Node nodeMatched = new Node(Token.NAME, "/original/path/file.js", 5, 0);
        sourceMap.addMapping(nodeMatched, new FilePosition(0, 0), new FilePosition(0, 5));

        // 2. เคสที่ซ้ำเพื่อทดสอบ Cache Hit (fixupSourceLocation cache)
        sourceMap.addMapping(nodeMatched, new FilePosition(1, 0), new FilePosition(1, 5));

        // 3. เคสที่ไม่ตรงกับ Prefix ใดๆ (Fallback to original)
        Node nodeUnmatched = new Node(Token.NAME, "/other/path/file.js", 5, 0);
        sourceMap.addMapping(nodeUnmatched, new FilePosition(0, 0), new FilePosition(0, 5));
    }

    @Test
    public void testEmptyPrefixMappings() {
        // ทดสอบเมื่อ prefixMappings เป็น empty list (ค่าเริ่มต้น)
        sourceMap.setPrefixMappings(Collections.emptyList());
        Node node = new Node(Token.NAME, "test.js", 1, 0);
        sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 5));
    }

    @Test
    public void testAuxiliaryMethods() throws IOException {
        StringBuilder sb = new StringBuilder();
        sourceMap.setStartingPosition(1, 1);
        sourceMap.setWrapperPrefix("wrapper");
        sourceMap.validate(true);
        sourceMap.appendTo(sb, "out.js");
        
        // ทดสอบ reset ซึ่งจะเคลียร์ Cache และ Generator
        sourceMap.reset();
    }
}
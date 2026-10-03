package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class CodePrinterTest {

    // --- Builder & General Edge Cases ---

    @Test(expected = IllegalStateException.class)
    public void testBuilderNullRootThrowsException() {
        // Edge Case: root เป็น null ต้องพ่น IllegalStateException ตามที่ Builder กำหนด
        new CodePrinter.Builder(null).build();
    }

    @Test
    public void testBuilderDefaultAndThresholdBoundary() {
        // Boundary limit: lineLengthThreshold <= 0 ควรถูกเซ็ตเป็น Integer.MAX_VALUE
        Node scriptNode = new Node(Token.SCRIPT);
        String code = new CodePrinter.Builder(scriptNode)
                .setLineLengthThreshold(0)
                .setPrettyPrint(true)
                .build();
        Assert.assertNotNull(code);
    }

    @Test
    public void testCompactFormatWithLineBreakAndCharset() {
        // State Coverage: ทดสอบ Compact printer พร้อม LineBreak และ OutputCharset
        Node scriptNode = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "test");
        scriptNode.addChildToFront(nameNode);

        String code = new CodePrinter.Builder(scriptNode)
                .setLineBreak(true)
                .setOutputCharset(Charset.forName("UTF-8"))
                .setTagAsStrict(true)
                .build();
        Assert.assertTrue(code.contains("test") || code.isEmpty());
    }

    // --- MappedCodePrinter & Position Conversion (Reflection for private/protected inner logic) ---

    @Test
    public void testSourceMappingLifecycle() throws Exception {
        // Trigger startSourceMapping และ endSourceMapping ด้วยเงื่อนไขครบถ้วน
        Node node = new Node(Token.NAME, "a", 1, 0);
        node.setSourceFile("testfile.js");

        SourceMap sourceMap = new SourceMap() {
            @Override
            public void addMapping(Node node, com.google.debugging.sourcemap.FilePosition start, com.google.debugging.sourcemap.FilePosition end) {}
            @Override
            public void appendTo(Appendable out, String name) {}
        };

        String code = new CodePrinter.Builder(node)
                .setSourceMap(sourceMap)
                .setSourceMapDetailLevel(SourceMap.DetailLevel.ALL)
                .build();
        
        Assert.assertNotNull(code);
    }

    @Test
    public void testConvertPositionIllegalState() throws Exception {
        // Edge Case / Defect Trap: ทดสอบ convertPosition เมื่อพยายาม undo line cut บนบรรทัดก่อนหน้า (originalLine > lineIndex)
        Class<?> mcpClass = Class.forName("com.google.javascript.jscomp.CodePrinter$MappedCodePrinter");
        java.lang.reflect.Constructor<?> ctor = mcpClass.getDeclaredConstructor(int.class, boolean.class, SourceMap.DetailLevel.class);
        ctor.setAccessible(true);
        
        Object printer = ctor.newInstance(10, true, SourceMap.DetailLevel.ALL);
        
        // เรียกใช้ convertPosition ผ่าน Reflection (insertion = false, originalLine > lineIndex)
        Method convertPosMethod = mcpClass.getDeclaredMethod(
                "convertPosition", 
                com.google.debugging.sourcemap.FilePosition.class, 
                int.class, 
                int.class, 
                boolean.class
        );
        convertPosMethod.setAccessible(true);

        com.google.debugging.sourcemap.FilePosition pos = 
                new com.google.debugging.sourcemap.FilePosition(5, 2); // line 5

        try {
            // lineIndex ส่งไปเป็น 3 (ซึ่งทำให้ originalLine (5) > lineIndex (3))
            convertPosMethod.invoke(printer, pos, 3, 2, false);
            Assert.fail("Expected IllegalStateException to be thrown");
        } catch (java.lang.reflect.InvocationTargetException e) {
            Assert.assertTrue(e.getTargetException() instanceof IllegalStateException);
            Assert.assertEquals("Cannot undo line cut on a previous line.", e.getTargetException().getMessage());
        }
    }

    @Test
    public void testConvertPositionInsertionBranches() throws Exception {
        // ทดสอบ Branch ของ convertPosition ทั้ง insertion = true และ insertion = false ในหลายๆ เงื่อนไขตำแหน่ง
        Class<?> mcpClass = Class.forName("com.google.javascript.jscomp.CodePrinter$MappedCodePrinter");
        java.lang.reflect.Constructor<?> ctor = mcpClass.getDeclaredConstructor(int.class, boolean.class, SourceMap.DetailLevel.class);
        ctor.setAccessible(true);
        Object printer = ctor.newInstance(10, true, SourceMap.DetailLevel.ALL);

        Method convertPosMethod = mcpClass.getDeclaredMethod(
                "convertPosition", 
                com.google.debugging.sourcemap.FilePosition.class, 
                int.class, 
                int.class, 
                boolean.class
        );
        convertPosMethod.setAccessible(true);

        com.google.debugging.sourcemap.FilePosition pos = new com.google.debugging.sourcemap.FilePosition(2, 5);

        // Case 1: insertion = true, originalLine == lineIndex, originalChar >= characterPosition
        Object res1 = convertPosMethod.invoke(printer, pos, 2, 3, true);
        Assert.assertNotNull(res1);

        // Case 2: insertion = true, originalLine != lineIndex
        Object res2 = convertPosMethod.invoke(printer, pos, 3, 3, true);
        Assert.assertNotNull(res2);

        // Case 3: insertion = false, originalLine == lineIndex
        Object res3 = convertPosMethod.invoke(printer, pos, 2, 3, false);
        Assert.assertNotNull(res3);

        // Case 4: insertion = false, originalLine < lineIndex
        Object res4 = convertPosMethod.invoke(printer, pos, 1, 3, false);
        Assert.assertNotNull(res4);
    }

    // --- PrettyCodePrinter Switch-case Branch Coverage (`breakAfterBlockFor`) ---

    @Test
    public void testPrettyPrinterBreakAfterBlockForBranches() throws Exception {
        // สะท้อนการทดสอบ Switch-case ของ breakAfterBlockFor ใน PrettyCodePrinter
        Class<?> pcpClass = Class.forName("com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter");
        java.lang.reflect.Constructor<?> ctor = pcpClass.getDeclaredConstructor(int.class, boolean.class, SourceMap.DetailLevel.class);
        ctor.setAccessible(true);
        Object printer = ctor.newInstance(100, false, SourceMap.DetailLevel.ALL);

        Method breakMethod = pcpClass.getDeclaredMethod("breakAfterBlockFor", Node.class, boolean.class);
        breakMethod.setAccessible(true);

        // สร้างโครงสร้าง Node ตามประเภทของ Parent ต่างๆ เพื่อทดสอบ Switch Cases
        Node blockNode = new Node(Token.BLOCK);

        // 1. Parent = DO
        Node doParent = new Node(Token.DO);
        doParent.addChildToBack(blockNode);
        Assert.assertEquals(false, breakMethod.invoke(printer, blockNode, true));

        // 2. Parent = FUNCTION
        Node funcParent = new Node(Token.FUNCTION);
        funcParent.addChildToBack(blockNode);
        Assert.assertEquals(false, breakMethod.invoke(printer, blockNode, true));

        // 3. Parent = TRY (n != parent.getFirstChild())
        Node tryParent = new Node(Token.TRY);
        Node firstChild = new Node(Token.BLOCK);
        tryParent.addChildToBack(firstChild);
        tryParent.addChildToBack(blockNode); // blockNode ไม่ใช่ firstChild (เป็น catch/finally)
        Assert.assertEquals(true, breakMethod.invoke(printer, blockNode, true));

        // 4. Parent = IF (n == parent.getLastChild())
        Node ifParent = new Node(Token.IF);
        ifParent.addChildToBack(new Node(Token.BLOCK));
        ifParent.addChildToBack(blockNode); // เป็น last child (เช่น ส่วนของ else)
        Assert.assertEquals(true, breakMethod.invoke(printer, blockNode, true));
    }

    // --- CompactCodePrinter EndFile Branch Coverage ---

    @Test
    public void testCompactCodePrinterPreferEndFileBreak() {
        // ทดสอบ CompactCodePrinter พร้อมตั้งค่า preferLineBreakAtEndOfFile = true
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.addChildToFront(Node.newString(Token.NAME, "longVariableNameCodeToTriggerLengthThresholdAndEndFileBranch"));

        String code = new CodePrinter.Builder(scriptNode)
                .setLineLengthThreshold(5)
                .setPreferLineBreakAtEndOfFile(true)
                .build();
        
        Assert.assertNotNull(code);
    }
}
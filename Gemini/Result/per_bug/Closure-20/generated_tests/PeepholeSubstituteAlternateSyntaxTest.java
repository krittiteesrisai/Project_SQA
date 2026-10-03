package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeepholeSubstituteAlternateSyntaxTest {

    @Test
    public void testOptimizeSubtreeDefaultReturnNode() {
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(false);
        Node returnNode = IR.returnNode();
        Node result = opt.optimizeSubtree(returnNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldStandardConstructorsObject() {
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
        // สร้างโหนด "new Object()"
        Node newObj = IR.newnode(IR.name("Object"));
        // จำลองสถานการณ์ AST Normalized
        Node result = opt.tryFoldStandardConstructors(newObj);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeStringArrayLiteralNotLate() {
        // เมื่อ late = false จะต้องคืนค่าเดิมทันทีตามเงื่อนไข !late
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node result = opt.optimizeSubtree(arrayLit);
        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
    }

    @Test
    public void testTryMinimizeStringArrayLiteralSavingTooSmall() {
        // ทดสอบกรณี numElements * 2 - STRING_SPLIT_OVERHEAD <= 0
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
        Node arrayLit = IR.arraylit(IR.string("a"));
        Node result = opt.optimizeSubtree(arrayLit);
        assertNotNull(result);
    }

    @Test
    public void testPickDelimiterAllLengthOne() {
        // ทดสอบกรณี strings ทั้งหมดมีความยาวเท่ากับ 1 (allLength1 = true) คืนค่า ""
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"), IR.string("c"));
        Node result = opt.optimizeSubtree(arrayLit);
        assertNotNull(result);
    }

    @Test
    public void testTryReduceReturnWithUndefined() {
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(false);
        Node returnNode = IR.returnNode(IR.name("undefined"));
        Node result = opt.optimizeSubtree(returnNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldRegularExpressionConstructorTooFewArgs() {
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
        Node callNode = IR.call(IR.name("RegExp"));
        Node result = opt.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testUnknownNodeTypeFallback() {
        PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(false);
        Node debuggerNode = new Node(Token.DEBUGGER);
        Node result = opt.optimizeSubtree(debuggerNode);
        assertEquals(debuggerNode, result);
    }
}